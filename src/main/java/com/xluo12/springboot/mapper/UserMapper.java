package com.xluo12.springboot.mapper;

import com.xluo12.springboot.entities.User;

import java.util.List;

/**
 * @Auther: xluo12
 */
//@Mapper 或 @MapperScan("com.xluo12.springboot.mapper")
public interface UserMapper {

    User getUserByUsername(String username);

    List<User> getUsers(User user);

    User getUserById(Integer id);

    int addUser(User user);

    int deleteUserById(Integer id);

    int updateUser(User user);

}
