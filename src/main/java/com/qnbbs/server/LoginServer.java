package com.qnbbs.server;

import com.qnbbs.obj.User;
import com.qnbbs.service.LoginSverice;
import org.springframework.stereotype.Component;

//登录注册业务
@Component
public class LoginServer implements LoginSverice {


    @Override
    public User login() {
        return null;
    }

    @Override
    public String register() {
        return null;
    }
}
