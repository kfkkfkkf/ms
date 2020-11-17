package com.example.server;


import com.example.pojo.User;

public interface UserServer {

    //增加用户
    void addUser(User user);

    //删除用户
    void deleteUser(int id);

    //修改用户
    int updateUser(User user);

    //查询用户
    User queryUser(int id);

}
