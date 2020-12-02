package com.qnbbs.service;

import com.qnbbs.obj.User;
import org.springframework.stereotype.Component;

//登录注册接口
@Component
public interface LoginSverice {

    //登录业务
    public User login();
    //注册业务
    public String register();
}
