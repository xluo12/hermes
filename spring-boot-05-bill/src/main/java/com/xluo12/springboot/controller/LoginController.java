package com.xluo12.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class LoginController {


    @PostMapping("/login")
    public String login(String username, String password, Map<String, Object> map) {

        if (!StringUtils.isEmpty(username) && "123".equals(password)) {
            return "main/index";
        }

        map.put("msg", "用户名或密码错误");
        return "main/login";
    }
}
