package org.hit.ices.ices_pm_platform.controller;

import org.deckfour.xes.info.XLogInfo;
import org.hit.ices.ices_pm_platform.preexperiment.XESModelParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class LogInfoController {
    @RequestMapping("/ices_pm_platform_logInfo")
    public String sendLogInfo(Model model) throws Exception {
        XESModelParser xesModelParser = new XESModelParser();

        Map map = new HashMap<>();
        XLogInfo logInfo = xesModelParser.getLogInfo() ;
        map.put ("numberOfTraces", logInfo.getNumberOfTraces());
        map.put ("numberOfEvents", logInfo.getNumberOfEvents());
        map.put ("numberOfEventTypes", logInfo.getNameClasses().size());
        map.put ("numberOfParticipants", logInfo.getResourceClasses().size());
        map.put ("startTime", logInfo.getLogTimeBoundaries().getStartDate());
        map.put ("endTime", logInfo.getLogTimeBoundaries().getEndDate());

        model.addAttribute("LogInfo", map);
        return "ices_pm_platform_logInfo";
    }
}
