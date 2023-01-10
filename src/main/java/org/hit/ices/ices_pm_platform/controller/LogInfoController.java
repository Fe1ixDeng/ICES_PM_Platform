package org.hit.ices.ices_pm_platform.controller;

import org.hit.ices.ices_pm_platform.preexperiment.XESModelParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class LogInfoController {
    @RequestMapping("/ices_pm_im_logInfo")
    public String sendLogInfo(Model model) throws Exception {
        XESModelParser xesModelParser = new XESModelParser();

        model.addAttribute("LogInfo", xesModelParser.getLogInfo());
        return "/ices_pm_im/ices_pm_im_logInfo";
    }
}
