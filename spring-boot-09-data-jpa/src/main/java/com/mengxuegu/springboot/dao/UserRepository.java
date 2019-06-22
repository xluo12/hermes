package com.mengxuegu.springboot.dao;

import com.mengxuegu.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: spring-boot-01-hello
 * @description: TODO
 * @author: xluo12
 * @create: 2019-06-21 15:20
 **/
                                                //<entity, db data type>
public interface UserRepository extends JpaRepository<User, Integer> {
}
