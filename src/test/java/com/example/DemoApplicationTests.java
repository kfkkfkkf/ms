package com.example;

import com.example.pojo.User;
import com.example.server.UserServer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private UserServer userServer;
    @Test
    void contextLoads() {
    }
    @Test
    void addUser(){
        userServer.addUser(new User(11,"15351429867","12321","男",new Date(),
                "四川成都","2422442222@qq.com","1",new Date(),new Date()));
    }
    //删除用户测试
    @Test
    void deleteUser(){
        userServer.deleteUser(12);
    }
    //查询用户测试
    @Test
    void queryUser(){
        User user = userServer.queryUser(3);
        System.out.println(user);
    }
    //修改用户测试
    @Test
    void  updateUser(){
        userServer.updateUser(new User(3,"15351455467","12321","男",new Date(),
                "四川成都","43636324@qq.com","1",new Date(),new Date()));
    }
}
