package org.hit.ices.ices_pm_platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLController {
//    门户
    @RequestMapping("/portal")
    public String index(){
        return "ices_pm_platform_portal";
    }
//    门户欢迎页面
    @RequestMapping("/ices_pm_platform_defaultDisplay.html")
    public String index_defaultDisplay(){
        return "ices_pm_platform_defaultDisplay";
    }
//    临时引用页面，在建功能可以引用
    @RequestMapping("/ices_pm_platform_tempReference.html")
    public String index_tempReference(){
    return "ices_pm_platform_tempReference";
}
//   vspm门户
    @RequestMapping("/ices_pm_vspm/ices_pm_vspm_portal.html")
    public String index_vspm(){
        return "ices_pm_vspm/ices_pm_vspm_portal";
    }
//  vspm展示页面
    @RequestMapping("/ices_pm_vspm/ices_pm_vspm_default.html")
    public String index_vspm_default(){
        return "ices_pm_vspm/ices_pm_vspm_default";
    }
    @RequestMapping("/ices_pm_vspm/ices_pm_vspm_logInfo.html")
    public String index_vspm_logInfo(){
        return "ices_pm_vspm/ices_pm_vspm_logInfo";
    }
    @RequestMapping("/ices_pm_vspm/ices_pm_vspm_instanceInfo.html")
    public String index_vspm_instanceInfo(){return "ices_pm_vspm/ices_pm_vspm_instanceInfo";}
    @RequestMapping("/ices_pm_vspm/ices_pm_vspm_variantInfo.html")
    public String index_vspm_variantInfo(){
        return "ices_pm_vspm/ices_pm_vspm_variantInfo";
    }
    @RequestMapping("/ices_pm_vspm/ices_pm_vspm_variantGraph.html")
    public String index_vspm_variantGraph(){
        return "ices_pm_vspm/ices_pm_vspm_variantGraph";
    }
    @RequestMapping("/ices_pm_vspm/ices_pm_vspm_apMapping.html")
    public String index_vspm_apMapping(){
        return "ices_pm_vspm/ices_pm_vspm_apMapping";
    }
    @RequestMapping("/ices_pm_vspm/ices_pm_vspm_apvMapping.html")
    public String index_vspm_apvMapping(){
        return "ices_pm_vspm/ices_pm_vspm_apvMapping";
    }
    @RequestMapping("/ices_pm_vspm/ices_pm_vspm_serviceProcessModel.html")
    public String index_vspm_serviceProcessModel(){
        return "ices_pm_vspm/ices_pm_vspm_serviceProcessModel";
    }
    @RequestMapping("/ices_pm_vspm/ices_pm_vspm_serviceValueChain.html")
    public String index_vspm_serviceValueChain(){
        return "ices_pm_vspm/ices_pm_vspm_serviceValueChain";
    }
}