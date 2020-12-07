package com.qnbbs.controller;


import com.qnbbs.obj.User;
import com.qnbbs.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@RequestMapping("/do")
@RestController
public class JsonController {

    @Autowired
    private LoginService service;


    @RequestMapping("/test")
    public String test(){
        return "测试";
    }

    //登录业务
    @RequestMapping("/login")
    public String login(@RequestParam("userName")String userName, @RequestParam("passWord")String passWord, HttpSession s){
        //获取用户密码
        User u = service.loginService(userName,passWord);
        if(u!=null){
            //若密码一致
            s.setAttribute("user",u);
            return "登录成功";
        }else{

            return "注册失败";
        }
    }

    //注册业务
    @RequestMapping("/register")
    public String register(@RequestParam("userName")String userName,@RequestParam("passWord")String passWord,@RequestParam("nick")String nick,@RequestParam("email")String email,@RequestParam("numberPhone")String numberPhone){
        System.out.printf("开始注册"+"\n");
       Integer i = service.register(userName,passWord,nick,email,numberPhone);
        if(i!=0){
            //注册成功
            System.out.printf("注册成功"+"\n");
            return "注册成功";
        }else{
            //注册失败
            System.out.printf("注册失败"+"\n");
            return "注册失败";
        }

    }

}
