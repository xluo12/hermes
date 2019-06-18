package com.xluo12.springboot.controller;


import com.xluo12.springboot.dao.ProviderDao;
import com.xluo12.springboot.entities.Provider;
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
    public String list(Map<String, Object> map, @RequestParam(value="providerName", required = false) String providerName) {

        logger.info("供应商列表查询: " + providerName);

        Collection<Provider> providers = providerDao.getAll(providerName);
        map.put("providers", providers);
        map.put("providerName", providerName);
        return "provider/list";
     }

    @GetMapping("/provider/{pid}")
    public String view(@PathVariable("pid") Integer pid, Map<String, Object> map) {

        logger.info("查询id: " + pid);

        Provider provider = providerDao.getProvider(pid);

        map.put("provider", provider);
        return "provider/view";
    }
}
