package com.mengxuegu.springboot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @program: spring-boot-01-hello
 * @description: TODO
 * @author: xluo12
 * @create: 2019-06-22 00:28
 **/
@Service
public class AsyncService {

    @Async
    public void batchAdd() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("completed");
    }
}
