package com.example.pojo;

import java.util.Date;

public class User {

    private int id; //主键
    private String mobile; //用户登录名（使用电话号码）
    private String password;//用户密码
    private String sex; //性别
    private Date birthdate;  //出生日期
    private String address; //详细地址
    private String email; //邮箱
    private String state; // -1表示删除，1表示正常状态
    private Date create_time; //创建时间
    private Date update_time; //修改时间

    public User() {
    }

    public User(int id, String mobile, String password, String sex, Date birthdate, String address, String email, String state, Date create_time, Date update_time) {
        this.id = id;
        this.mobile = mobile;
        this.password = password;
        this.sex = sex;
        this.birthdate = birthdate;
        this.address = address;
        this.email = email;
        this.state = state;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

}
