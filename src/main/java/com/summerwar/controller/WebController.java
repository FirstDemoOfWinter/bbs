package com.summerwar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//页面访问控制
@Controller
public class WebController {

    //首页
    @RequestMapping({"/index","/"})
    public String index(){
        System.out.printf("---访问首页"+"\n");
        return "/index";
    }

    //登录
    @RequestMapping("/login")
    public String login(){
        System.out.printf("---访问登录界面"+"\n");
        return "login";
    }

    //注册
    @RequestMapping("/register")
    public String register(){
        System.out.printf("---访问注册页面"+"\n");
        return "register";
    }






}
