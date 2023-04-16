package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 声明一个控制器
@Controller
public class FirstController {
    @RequestMapping("/")
    public String index() {
        //设置视图名称
        return "index";
    }

    @RequestMapping("/hello")
    public String HelloWorld() {
        return "success";
    }

}

