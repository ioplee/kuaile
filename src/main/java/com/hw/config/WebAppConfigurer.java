package com.hw.config;

import com.hw.interceptor.CrossInterceptorHandler;
import com.hw.interceptor.UserInterceptorHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebAppConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new UserInterceptorHandler()).addPathPatterns("/**")
                .excludePathPatterns(
                        "/login.html",
                        "/testInfo",
                        "/api/**",
                        "/android/**",
                        "/tokens",
                        "/registerPlayer/**",
                        "/presentapp/**",
                        "/wxController/**",
                        "/record/**",
                        "/situation/**",
                        "/activity/**",
                        "/gameNotice/**",
                        "/help/**",
                        "/userInfo/**",
                        "/match/**",
                        "/shop/**",
                        "/rankingList/**",
                        "/gamePrizeActivity/**",
                        "/ipay/**",
                        "/gameAnnouncement/**",
                        "/gonggaoGame/**",
                        "/gameVersion/**",
                        "/cash_bonus/**"
                );
        registry.addInterceptor(new CrossInterceptorHandler()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
