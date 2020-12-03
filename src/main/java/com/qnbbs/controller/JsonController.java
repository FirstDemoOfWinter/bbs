package com.qnbbs.controller;


import com.qnbbs.obj.User;
import com.qnbbs.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/do")
@RestController
public class JsonController {

    @Autowired
    private LoginService service;

    //登录业务
    @RequestMapping("/login")
    public String login(@RequestParam("userName")String userName,@RequestParam("passWord")String passWord){
        //获取用户密码
        User u = service.getPassWord(userName);
        if(u.getPassWord().equals(passWord)){
            //若密码一致
            return "11";
        }else{
            return "22";
        }
    }

    //注册业务
    @RequestMapping("/register")
    public String register(@RequestParam("userName")String userName,@RequestParam("passWord")String passWord,@RequestParam("nick")String nick,@RequestParam("email")String email,@RequestParam("numberPhone")String numberPhone){
        System.out.printf("开始注册");
       Integer i = service.register(userName,passWord,nick,email,numberPhone);
        if(i!=0){
            //注册成功
            return "注册成功";
        }else{
            //注册失败
            return "注册失败";
        }

    }

}
