package com.qnbbs.controller;


import com.qnbbs.obj.Result;
import com.qnbbs.obj.User;
import com.qnbbs.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
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
    public Result login(@RequestParam("userName")String userName, @RequestParam("passWord")String passWord, HttpServletRequest request){
        HttpSession s = request.getSession();
        //获取用户密码
        User u = service.loginService(userName,passWord);
        if(u!=null){
            System.out.printf(u.toString()+"\n");
            //若密码一致
            s.setAttribute("user",u);
            System.out.printf("登录成功"+"\n");
            return new Result(200,"登录成功");
        }else{
            System.out.printf("登录失败"+"\n");
            return new Result(400,"登录失败");
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
