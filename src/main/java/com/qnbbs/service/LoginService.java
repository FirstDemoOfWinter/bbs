package com.qnbbs.service;

import com.qnbbs.obj.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//登录注册接口
@Repository
public interface LoginService {

    //登录业务
    User loginService(String userName,String passWord);
    //注册业务
    Integer register(String userName,String passWord,String nick,String email,String numberPhone);
}
