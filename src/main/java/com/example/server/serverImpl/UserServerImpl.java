package com.example.server.serverImpl;


import com.example.mapper.UserMapper;
import com.example.pojo.User;
import com.example.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServerImpl implements UserServer {

    @Autowired
    private UserMapper userMapper;



    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userMapper.deleteUser(id);
    }

    @Override
    public int updateUser(User user) {
         return userMapper.updateUser(user);
    }

    @Override
    public User queryUser(int id) {
       return userMapper.queryUser(id);
    }




}
