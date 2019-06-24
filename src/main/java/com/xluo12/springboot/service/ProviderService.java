package com.xluo12.springboot.service;

import com.xluo12.springboot.entities.Provider;
import com.xluo12.springboot.mapper.ProviderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * http://localhost:8080/updateProvider?providerCode=123&providerName=aaa&people=xxx&phone=8888&address=99&pid=4
 * @Auther: 梦学谷
 */
@CacheConfig(cacheNames="provider")
@Service
public class ProviderService {

    @Autowired
    ProviderMapper providerMapper;


    public List<Provider> getProviders(Provider provider){
        List<Provider> providers = providerMapper.getProviders(provider);
        return providers;
    }

    @Cacheable(key = "#pid")
    public Provider getProviderByPid(Integer pid){
        Provider provider = providerMapper.getProviderByPid(pid);
        return provider;
    }

    @CachePut(key="#result.pid")
    public Provider updateProvider(Provider provider) {
        providerMapper.updateProvider(provider);
        return provider;
    }

    public Provider addProvider(Provider provider){
        providerMapper.addProvider(provider);
        return provider;
    }

    @CacheEvict(key="#pid")
    public Integer deleteProviderByPid(Integer pid) {
        providerMapper.deleteProviderByPid(pid);
        return pid;
    }
}
