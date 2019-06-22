package com.mengxuegu.springboot.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @program: spring-boot-01-hello
 * @description: TODO
 * @author: xluo12
 * @create: 2019-06-22 00:41
 **/
@Service
public class ScheduleService {

    private static int count = 1;

    @Scheduled(cron = "*/3 * * * * MON-FRI")
    public void dataCount() {
        System.out.println("Count: " + (count++));
    }
}
