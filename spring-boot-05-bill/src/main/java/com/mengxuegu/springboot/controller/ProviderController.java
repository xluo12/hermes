package com.mengxuegu.springboot.controller;


import com.mengxuegu.springboot.entities.Provider;
import com.mengxuegu.springboot.dao.ProviderDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

@Controller
public class ProviderController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    ProviderDao providerDao;

    @GetMapping("/providers")
    public String list(Map<String, Object> map, @RequestParam(value = "providerName", required = false) String providerName) {

        logger.info("供应商列表查询: " + providerName);

        Collection<Provider> providers = providerDao.getAll(providerName);
        map.put("providers", providers);
        map.put("providerName", providerName);
        return "provider/list";
    }

    @GetMapping("/provider/{pid}")
    public String view(@PathVariable("pid") Integer pid, @RequestParam(value = "type", defaultValue = "view") String type, Map<String, Object> map) {

        logger.info("查询id: " + pid);

        Provider provider = providerDao.getProvider(pid);

        map.put("provider", provider);
        return "provider/" + type;
    }

    @PutMapping("/provider")
    public String update(Provider provider) {

        logger.info("更新信息...");
        providerDao.save(provider);

        return "redirect:providers";
    }

    @GetMapping("/provider")
    public String toAddPage() {
        logger.info("To添加供应商");
        return "provider/add";
    }

    @PostMapping("/provider")
    public String add(Provider provider) {
        logger.info("添加供应商" + provider);
        providerDao.save(provider);
        return "redirect:providers";
    }

    @DeleteMapping("/provider/{pid}")
    public String delete(@PathVariable("pid") Integer pid) {
        logger.info("删除供应商id: " + pid);
        providerDao.delete(pid);
        return "redirect:/providers";
    }
}
