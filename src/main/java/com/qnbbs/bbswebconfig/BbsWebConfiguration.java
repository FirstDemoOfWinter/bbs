package com.qnbbs.bbswebconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class BbsWebConfiguration extends WebMvcConfigurationSupport {

    //静态文件设置
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将路径static/** 映射到 /static/
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/")
                .addResourceLocations("classpath:/static/img/");
        super.addResourceHandlers(registry);
    }

    //拦截器设置
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Interceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/")
                .excludePathPatterns("/login")
                .excludePathPatterns("/index")
                //静态资源路径开放
                .excludePathPatterns("/**/*.png","/**/*.jpg","/**/*.gif","/**.ico");
        super.addInterceptors(registry);
    }
}
