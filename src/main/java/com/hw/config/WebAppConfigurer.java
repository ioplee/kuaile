package com.hw.config;

import com.hw.interceptor.CrossInterceptorHandler;
import com.hw.interceptor.UserInterceptorHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 配置模板资源路径
        registry.addResourceHandler("/images/**").addResourceLocations("classpath:/static/images/");
        registry.addResourceHandler("/lay/**").addResourceLocations("classpath:/static/lui/");
        registry.addResourceHandler("/pure/**").addResourceLocations("classpath:/static/pure/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new UserInterceptorHandler()).addPathPatterns("/**")
                .excludePathPatterns(
                        "/login.html",
                        "/index",
                        "/testInfo",
                        "/api/**",
                        "/android/**",
                        "/tokens",
                        "/images/**",
                        "/lay/**",
                        "/pure/**"
                );
        registry.addInterceptor(new CrossInterceptorHandler()).addPathPatterns("/**")
                .excludePathPatterns("/images/**",
                        "/lay/**",
                        "/pure/**");
    }
}
