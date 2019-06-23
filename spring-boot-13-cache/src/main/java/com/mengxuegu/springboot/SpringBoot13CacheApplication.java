package com.mengxuegu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@MapperScan("com.mengxuegu.springboot.mapper")
@SpringBootApplication
public class SpringBoot13CacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot13CacheApplication.class, args);
	}

}
