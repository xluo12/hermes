package com.mengxuegu.springboot.config;

import com.mengxuegu.springboot.filter.MyFilter;
import com.mengxuegu.springboot.servlet.HelloServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @program: spring-boot-01-hello
 * @description: TODO
 * @author: xluo12
 * @create: 2019-06-19 12:13
 **/
@Configuration
public class MyServletConfig {

    /**
     * @Description register servlet
     * @Param []
     * @return org.springframework.boot.web.servlet.ServletRegistrationBean
     **/
    @Bean
    public ServletRegistrationBean helloServlet() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new HelloServlet(), "/hello");
        bean.setLoadOnStartup(1);
        return bean;
    }

//    /**
//     * @Description register filter
//     * @Param []
//     * @return org.springframework.boot.web.servlet.FilterRegistrationBean
//     **/
//    @Bean
//    public FilterRegistrationBean myFilter() {
//        FilterRegistrationBean bean = new FilterRegistrationBean();
//        bean.setFilter(new MyFilter());
//        bean.setUrlPatterns(Arrays.asList("/hello"));
//        return bean;
//    }
}
