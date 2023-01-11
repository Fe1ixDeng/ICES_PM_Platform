package org.hit.ices.ices_pm_platform.controller;

import org.hit.ices.ices_pm_platform.service.InductiveMinerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class HTMLController {


    @Value("${file-save-path}")
    private String fileSavePath;
    @Autowired
    private InductiveMinerService inductiveMinerService;

//    门户
    @RequestMapping("/")
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
    public String index_tempReference(){return "ices_pm_platform_tempReference";}

/*----以下是实验部分----------------------------------------------------------------------------------------------------*/

//    alpha算法门户
    @RequestMapping("/ices_pm_alphaalgorithm/ices_pm_alphaalgorithm_portal.html")
    public String index_alphaalgorithm(){
    return "ices_pm_alphaalgorithm/ices_pm_alphaalgorithm_portal";
}
//    alpha算法展示页面
    @RequestMapping("/ices_pm_alphaalgorithm/ices_pm_alphaalgorithm_default.html")
    public String index_alphaalgorithm_default(){return "ices_pm_alphaalgorithm/ices_pm_alphaalgorithm_default";}
    @RequestMapping("/ices_pm_alphaalgorithm/ices_pm_alphaalgorithm_logInfo.html")
    public String index_alphaalgorithm_logInfo(){
        return "ices_pm_alphaalgorithm/ices_pm_alphaalgorithm_logInfo";
    }
    @RequestMapping("/ices_pm_alphaalgorithm/ices_pm_alphaalgorithm_instanceInfo.html")
    public String index_alphaalgorithm_instanceInfo(){return "ices_pm_alphaalgorithm/ices_pm_alphaalgorithm_instanceInfo";}
    @RequestMapping("/ices_pm_alphaalgorithm/ices_pm_alphaalgorithm_variantInfo.html")
    public String index_alphaalgorithm_variantInfo(){
        return "ices_pm_alphaalgorithm/ices_pm_alphaalgorithm_variantInfo";
    }
    @RequestMapping("/ices_pm_alphaalgorithm/ices_pm_alphaalgorithm_variantGraph.html")
    public String index_alphaalgorithm_variantGraph(){
        return "ices_pm_alphaalgorithm/ices_pm_alphaalgorithm_variantGraph";
    }
    @RequestMapping("/ices_pm_alphaalgorithm/ices_pm_alphaalgorithm_processModel.html")
    public String index_alphaalgorithm_processModel(){return "ices_pm_alphaalgorithm/ices_pm_alphaalgorithm_processModel";}

//    hm门户
    @RequestMapping("/ices_pm_hm/ices_pm_hm_portal.html")
    public String index_hm(){
    return "ices_pm_hm/ices_pm_hm_portal";
}
//    hm展示页面
    @RequestMapping("/ices_pm_hm/ices_pm_hm_default.html")
    public String index_hm_default(){return "ices_pm_hm/ices_pm_hm_default";}
    @RequestMapping("/ices_pm_hm/ices_pm_hm_logInfo.html")
    public String index_hm_logInfo(){
        return "ices_pm_hm/ices_pm_hm_logInfo";
    }
    @RequestMapping("/ices_pm_hm/ices_pm_hm_instanceInfo.html")
    public String index_hm_instanceInfo(){return "ices_pm_hm/ices_pm_hm_instanceInfo";}
    @RequestMapping("/ices_pm_hm/ices_pm_hm_variantInfo.html")
    public String index_hm_variantInfo(){
        return "ices_pm_hm/ices_pm_hm_variantInfo";
    }
    @RequestMapping("/ices_pm_hm/ices_pm_hm_variantGraph.html")
    public String index_hm_variantGraph(){
        return "ices_pm_hm/ices_pm_hm_variantGraph";
    }
    @RequestMapping("/ices_pm_hm/ices_pm_hm_processModel.html")
    public String index_hm_processModel(){
        return "ices_pm_hm/ices_pm_hm_processModel";
    }

//    im门户
    @RequestMapping("/ices_pm_im/ices_pm_im_portal.html")
    public String index_im() throws IOException {
        return inductiveMinerService.IM();
    }
//    im展示页面
    @RequestMapping("/ices_pm_im/ices_pm_im_default.html")
    public String index_im_default(){return "ices_pm_im/ices_pm_im_default";}
    @RequestMapping("/ices_pm_im/ices_pm_im_logInfo.html")
    public String index_im_logInfo(){
        return "ices_pm_im/ices_pm_im_logInfo";
    }
    @RequestMapping("/ices_pm_im/ices_pm_im_instanceInfo.html")
    public String index_im_instanceInfo(){return "ices_pm_im/ices_pm_im_instanceInfo";}
    @RequestMapping("/ices_pm_im/ices_pm_im_variantInfo.html")
    public String index_im_variantInfo(){
        return "ices_pm_im/ices_pm_im_variantInfo";
    }
    @RequestMapping("/ices_pm_im/ices_pm_im_variantGraph.html")
    public String index_im_variantGraph(){
        return "ices_pm_im/ices_pm_im_variantGraph";
    }
    @RequestMapping("/ices_pm_im/ices_pm_im_processModel.html")
    public String index_im_processModel(){
        return "ices_pm_im/ices_pm_im_processModel";
    }

//    vspm门户
    @RequestMapping("/ices_pm_vspm/ices_pm_vspm_portal.html")
    public String index_vspm(){
        return "ices_pm_vspm/ices_pm_vspm_portal";
    }
//    vspm展示页面
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