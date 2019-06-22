package com.mengxuegu.springboot.service.impl;

import com.mengxuegu.springboot.dao.UserRepository;
import com.mengxuegu.springboot.entity.User;
import com.mengxuegu.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


/**
 * @program: spring-boot-01-hello
 * @description: TODO
 * @author: xluo12
 * @create: 2019-06-21 15:48
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Transactional
    @Override
    public Boolean addUser(User user) {

        userRepository.save(new User("1", "1"));
        userRepository.save(new User("12", "12"));
        userRepository.save(new User("123", "123"));
        userRepository.save(new User("1234", "1234"));
        userRepository.save(new User("12345", "12345"));
        userRepository.save(new User("123456", "123456"));

        userRepository.save(user);
        return null;
    }
}
