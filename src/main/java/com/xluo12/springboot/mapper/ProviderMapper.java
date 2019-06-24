package com.xluo12.springboot.mapper;

import com.xluo12.springboot.entities.Provider;


import java.util.List;

/**
 * @Auther: xluo12
 */
//@Mapper 或 @MapperScan("com.xluo12.springboot.mapper")
public interface ProviderMapper {

    List<Provider> getProviders(Provider provider);

    Provider getProviderByPid(Integer pid);

    int addProvider(Provider provider);

    int deleteProviderByPid(Integer pid);

    int updateProvider(Provider provider);

}
