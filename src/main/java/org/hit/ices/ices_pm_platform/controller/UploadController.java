package org.hit.ices.ices_pm_platform.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class UploadController {
    @PostMapping("/upload")
    public String up(@RequestParam("file") MultipartFile logFile) throws IOException {
        String path = System.getProperty("user.dir") + "/src/main/resources/data_transfer_file/";
        saveFile(logFile, path);
        return "上传成功";
    }

    public void saveFile(MultipartFile logFile, String path) throws IOException {
//          判断存储的目录是否存在，如果不存在则创建
        File dir = new File(path);
//          创建目录
        if (!dir.exists())
            dir.mkdir();

        File file = new File(path + "logFile.xes");
        logFile.transferTo(file);
    }
}