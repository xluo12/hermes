package com.mengxuegu.springboot.controller;

import com.mengxuegu.springboot.dao.UserRepository;
import com.mengxuegu.springboot.entity.User;
import com.mengxuegu.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @program: spring-boot-01-hello
 * @description: TODO
 * @author: xluo12
 * @create: 2019-06-21 15:29
 **/
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        Optional<User> userOptional = userRepository.findById(id);
        User user = userOptional.get();
        return user;
    }

    @GetMapping("/user")
    public User addUser(User user) {
        User user1 = userRepository.save(user);
        return user1;
    }

    @Autowired
    IUserService userService;

    @GetMapping("/user2")
    public User addUser2(User user) {
        userService.addUser(user);
        return user;
    }
}
