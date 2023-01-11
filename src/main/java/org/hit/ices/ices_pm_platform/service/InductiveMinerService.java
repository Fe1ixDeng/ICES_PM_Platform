package org.hit.ices.ices_pm_platform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

//@Service
public class InductiveMinerService {
//    从yml中读取python解释器的地址
    @Value("${python-interpreter-path}")
    private String pythonInterpreterPath;
//    从yml中读取file-save-path，这里面存储了上传的文件
    @Value("${file-save-path}")
    private String fileSavePath;

//    从yml中读取python-save-path,用于存储python脚本的结果文件
    @Value("${python-save-path}")
    private String pythonSavePath;

//    python脚本的路径
    private String pythonFilePath = "/src/main/resources/algorithm_api/bpmn_inductive.py";


    public String IM() throws IOException {

        String uploadFileName ="logFile.xes";
        File directory = new File("");//设定为当前文件夹
        String rootPath = directory.getAbsolutePath();//获取项目的绝对路径，也就是根路径
//        合成绝对路径
        String absolute_fileSavePath = rootPath + fileSavePath;
        String absolute_pythonFilePath = rootPath + pythonFilePath;
        String absolute_pythonSavePath = rootPath + pythonSavePath;
        String absolute_pythonInterpreterPath = rootPath + pythonInterpreterPath;



//        如果不存在路径就创建
        File folder = new File(pythonSavePath);
        if (!folder.isDirectory()) {folder.mkdirs();}

//        前面一半是本地环境下的python的启动文件地址，后面一半是要执行的python脚本地址
        String[] arguments = new String[] {absolute_pythonInterpreterPath, absolute_pythonFilePath,absolute_fileSavePath,uploadFileName,absolute_pythonSavePath};
        Process process;
        try {
            process = Runtime.getRuntime().exec(arguments);// 执行py脚本
//             用输入输出流来截取结果（print的结果）
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String actionStr = null;
            while ((actionStr = in.readLine()) != null) {
                System.out.println(actionStr);
            }
            in.close();
            //waitFor是用来显示脚本是否运行成功，1表示失败，0表示成功，还有其他的表示其他错误
            int re = process.waitFor();
            System.out.println(re);
            return actionStr;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "";
    }
}
