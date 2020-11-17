package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    //增加用户
    void addUser(User user);

    //删除用户
    void deleteUser(@Param("id") int id);

    //修改用户
    int updateUser(@Param("user") User user);

    //查询用户
    User queryUser(@Param("id") int id);
}
