package com.qnbbs.bbswebconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//拦截器配置
@Configuration
public class Interceptor implements HandlerInterceptor {

    //拦截处理
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.printf("---拦截器："+request.getServletPath().toString()+"\n");
        //获取用户名密码
        String username = request.getParameter("userName");
        String password = request.getParameter("passWord");
        System.out.printf("username:"+username);
        System.out.printf("password:"+password);
        return true;

    }
}
