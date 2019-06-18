package com.xluo12.springboot.controller;


import com.xluo12.springboot.dao.ProviderDao;
import com.xluo12.springboot.entities.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;
import java.util.Map;

@Controller
public class ProviderController {

    @Autowired
    ProviderDao providerDao;

    @GetMapping("/providers")
    public String list(Map<String, Object> map) {

        Collection<Provider> providers = providerDao.getAll();
        map.put("providers", providers);
        return "provider/list";
     }

}
