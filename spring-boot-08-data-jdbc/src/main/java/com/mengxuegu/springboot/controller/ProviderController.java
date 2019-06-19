package com.mengxuegu.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @program: spring-boot-01-hello
 * @description: TODO
 * @author: xluo12
 * @create: 2019-06-19 15:58
 **/
@RestController
public class ProviderController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/providers")
    public Map list() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * " +
                "from provider");
        Map<String, Object> map = maps.get(0);
        return map;
    }
}
