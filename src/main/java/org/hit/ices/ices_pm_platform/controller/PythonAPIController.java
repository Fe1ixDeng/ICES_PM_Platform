package org.hit.ices.ices_pm_platform.controller;

import org.hit.ices.ices_pm_platform.service.InductiveMinerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/python")
public class PythonAPIController {
    //    从yml中读取file-save-path，这里面存储了上传的文件
    @Value("${file-save-path}")
    private String fileSavePath;

    @Autowired
    private InductiveMinerService inductiveMinerService;


    @RequestMapping("/IM")
    public String im_API(HttpSession httpSession) throws IOException {
        String uploadFileName = (String) httpSession.getAttribute("uploadFileName");

        return inductiveMinerService.IM(uploadFileName);
    }

}
