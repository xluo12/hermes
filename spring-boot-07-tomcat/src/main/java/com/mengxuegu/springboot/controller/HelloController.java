package com.mengxuegu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: spring-boot-01-hello
 * @description: TODO
 * @author: xluo12
 * @create: 2019-06-19 13:48
 **/
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String execute() {
        return "hello world";
    }
}
