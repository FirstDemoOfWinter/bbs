package com.summerwar.bbswebconfig;

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
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //若密码正确
        if("wangergou".equals(username)&&"123456".equals(password)){
            System.out.printf("账号密码正确，继续访问"+"\n");
            return true;
        }else{
            System.out.printf("账号密码错误，请重新输入"+"\n");
            return false;
        }

    }
}
