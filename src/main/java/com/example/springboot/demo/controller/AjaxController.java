package com.example.springboot.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {
    /*
       PostMapping是专门用来处理post请求的一个注解
     */
    @PostMapping("/test")
    public String index(Model model){
        return "hello";
    }
}
