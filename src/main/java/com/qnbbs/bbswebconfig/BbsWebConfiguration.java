package com.qnbbs.bbswebconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.nio.charset.Charset;
import java.util.List;

@Configuration
public class BbsWebConfiguration extends WebMvcConfigurationSupport {
    @Bean
    public HttpMessageConverter<String> responseBodyConverter() {
        return new StringHttpMessageConverter(Charset.forName("UTF-8"));
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(responseBodyConverter());
        // 这里必须加上加载默认转换器，不然bug玩死人，并且该bug目前在网络上似乎没有解决方案
        // 百度，谷歌，各大论坛等。你可以试试去掉。
        addDefaultHttpMessageConverters(converters);
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(false);
    }


    //静态文件设置
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将路径static/** 映射到 /static/
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/")
                .addResourceLocations("classpath:/static/img/")
                .addResourceLocations("classpath:/css/","classpath:/js/","classpath:/fonts/");
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
                .excludePathPatterns("/do/login")
                .excludePathPatterns("/do/register")
                .excludePathPatterns("/login.html")
                .excludePathPatterns("/register.html")
                //静态资源路径开放
                .excludePathPatterns("/**/*.png","/**/*.jpg","/**/*.gif","/**.ico")
                .excludePathPatterns("/css/**","/js/**","/fonts/**");
        super.addInterceptors(registry);
    }
}
