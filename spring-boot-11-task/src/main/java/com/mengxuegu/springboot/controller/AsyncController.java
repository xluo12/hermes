package com.mengxuegu.springboot.controller;

import com.mengxuegu.springboot.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-boot-01-hello
 * @description: TODO
 * @author: xluo12
 * @create: 2019-06-22 00:30
 **/
@RestController
public class AsyncController {

    @Autowired
    AsyncService asyncService;

    @GetMapping("/hello")
    public String hello() {
        asyncService.batchAdd();
        return "success";

    }
}
