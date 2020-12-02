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
    private Integer numberPhone;
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
        email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(Integer numberPhone) {
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
}
