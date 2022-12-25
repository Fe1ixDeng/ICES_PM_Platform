package org.hit.ices.ices_pm_platform.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "<font style='font-size:28px;'>Hello Spring Boot</font>";
    }
}