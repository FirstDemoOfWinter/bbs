package com.qnbbs.obj;

import java.util.Date;

//用户信息
public class User {

    //主ID
    private int id;
    //uid
    private Integer uid;
    //账号
    private String userName;
    //密码
    private String passWord;
    //昵称
    private String nick;
    //邮箱地址
    private String email;
    //注册时间
    private Date date;
    //手机号
    private String numberPhone;
    //性别
    private int gender;
    //头像地址
    private String imgUrl;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uid=" + uid +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", nick='" + nick + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                ", numberPhone=" + numberPhone +
                ", gender=" + gender +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
