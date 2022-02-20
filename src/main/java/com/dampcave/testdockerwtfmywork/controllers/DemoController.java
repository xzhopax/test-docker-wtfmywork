package com.dampcave.testdockerwtfmywork.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/check")
    public String check() {
        return "Application is alive";
    }
}
