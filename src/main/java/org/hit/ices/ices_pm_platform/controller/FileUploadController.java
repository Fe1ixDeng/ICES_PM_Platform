package org.hit.ices.ices_pm_platform.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
public class FileUploadController {
//    从yml中读取file-save-path
    @Value("${file-save-path}")
    private String fileSavePath;
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");

    @PostMapping("/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest req, HttpSession httpSession) {
        String filePath = "";
//       获取日期字符串
//        String format = sdf.format(new Date());
//        路径为：fileSavePath/yyyy/MM/dd/
//        File folder = new File(fileSavePath + format);

        File folder = new File(fileSavePath);
//        如果不存在路径就创建
        if (!folder.isDirectory()) {folder.mkdirs();}

//        给上传的文件重命名，这是为了避免文件重名。()
//        String oldName = uploadFile.getOriginalFilename();
//        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());

        String Name =uploadFile.getOriginalFilename();
        try {
//            文件保存
            uploadFile.transferTo(new File(folder, Name));
//          生成上传文件的访问路径，并将访问路径返回。
            filePath = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/uploadFile/" + Name;
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败! ";
        }
        httpSession.setAttribute("uploadFileName",Name);
        System.out.println(httpSession.getAttribute("uploadFileName"));
        return "上传成功";
    }
}
