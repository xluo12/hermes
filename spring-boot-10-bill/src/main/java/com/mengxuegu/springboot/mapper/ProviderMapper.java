package com.mengxuegu.springboot.mapper;


import com.mengxuegu.springboot.entities.Provider;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

public interface ProviderMapper {

    List<Provider> getProviders(Provider provider);

    Provider getProviderByPid(Integer pid);

    int addProvider();

    int deleteProviderByPid(Integer pid);

    int updateProvider(Provider provider);
}
