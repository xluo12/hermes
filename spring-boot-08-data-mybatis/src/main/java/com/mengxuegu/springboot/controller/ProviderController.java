package com.mengxuegu.springboot.controller;

import com.mengxuegu.springboot.entities.Provider;
import com.mengxuegu.springboot.mapper.ProviderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    ProviderMapper providerMapper;

    @GetMapping("/provider/{pid}")
    public Provider getProvider(@PathVariable("pid") Integer pid) {
        Provider provider = providerMapper.getProviderByPid(pid);
        return provider;
    }

    @GetMapping("/provider")
    public Provider addProvider(Provider provider) {
        providerMapper.addProvider(provider);
        return provider;
    }

}
