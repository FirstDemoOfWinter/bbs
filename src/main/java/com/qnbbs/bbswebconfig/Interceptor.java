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
            //登录判断
            Session s = (Session) request.getSession().getAttribute("user");
            System.out.printf(""+s+"\n");
            //判断Seesion是否为
            if(s!=null){
                //若user不为空，放行
                System.out.printf("拦截器:"+"放行"+"\n");
                return true;
            }else{
                System.out.printf("拦截器:"+"拦截"+"\n");
                return false;
            }


    }
}
