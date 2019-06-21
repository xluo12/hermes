package com.mengxuegu.springboot.mapper;


import com.mengxuegu.springboot.entities.Provider;
import org.apache.ibatis.annotations.*;


public interface ProviderMapper {

    @Select("select * from provider where pid=#{pid}")
    Provider getProviderByPid(Integer pid);

    @Options(useGeneratedKeys = true, keyProperty = "pid")
    @Insert("insert into provider(providerName) values(#{providerName})")
    int addProvider(Provider provider);


    @Delete("delete from provider where pid=#{pid}")
    int deleteProviderByPid(Integer pid);


    @Update("update provider set prividerName=#{providerName} where pid=#{pid}")
    int updateProvider(Provider provider);

}
