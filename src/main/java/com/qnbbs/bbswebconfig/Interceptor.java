package com.qnbbs.bbswebconfig;

import com.qnbbs.obj.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;
import java.io.IOException;

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
        System.out.printf("username:"+username+"\n");
        System.out.printf("password:"+password+"\n");
        try{
            //登录判断
            User u = (User) request.getSession().getAttribute("User");
            if(u!=null){
                //若user不为空，放行
                return true;
            }
            //user为空 转到登录页面
            response.sendRedirect(request.getContextPath()+"/login.html");
        }catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }
}
