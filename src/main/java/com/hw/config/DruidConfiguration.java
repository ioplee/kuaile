package com.hw.config;

import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DruidConfiguration {

    /**
     * 注册一个：filterRegistrationBean
     * 这里是j2ee里的filter，决定哪部分连接无需经过过滤器就可以直接访问的
     * 还可以声明类似得ServletListenerRegistrationBean,ServletRegistrationBean
     * @return Filter
     */
    @Bean
    public FilterRegistrationBean<WebStatFilter> druidStatFilter2(){
        FilterRegistrationBean<WebStatFilter> filterRegistrationBean = new FilterRegistrationBean<>(new WebStatFilter());
        //添加过滤规则.
        filterRegistrationBean.addUrlPatterns("/*");
        //添加不需要忽略的格式信息.
        filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid2/*");
        return filterRegistrationBean;
    }
}
