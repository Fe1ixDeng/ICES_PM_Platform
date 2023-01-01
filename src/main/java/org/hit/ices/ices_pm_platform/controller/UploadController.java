//package org.hit.ices.ices_pm_platform.controller;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//import java.io.File;
//import java.io.IOException;
//
//@RestController
//public class UploadController {
////    从yml中读取file-save-path
//    @Value("${file-save-path}")
//    private String fileSavePath;
//    @PostMapping("/upload")
//    public String upload(MultipartFile uploadFile, HttpServletRequest req, HttpSession httpSession) {
//        String filePath = "";
//        File directory = new File("");//设定为当前文件夹
//        String rootPath = directory.getAbsolutePath();//获取项目的绝对路径，也就是根路径
//        fileSavePath = rootPath+fileSavePath;
//        File folder = new File(fileSavePath);
////        如果不存在路径就创建
//        if (!folder.isDirectory())
//            folder.mkdirs();
//
//        String Name =uploadFile.getOriginalFilename();
//        try {
////          文件保存
//            assert Name != null;
//            uploadFile.transferTo(new File(folder, Name));
////          生成上传文件的访问路径，并将访问路径返回。
//            filePath = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/uploadFile/" + Name;
//        } catch (IOException e) {
//            e.printStackTrace();
//            return "上传失败! ";
//        }
//        httpSession.setAttribute("uploadFileName",Name);
//        System.out.println(httpSession.getAttribute("uploadFileName"));
//        return "上传成功";
//    }
//}
