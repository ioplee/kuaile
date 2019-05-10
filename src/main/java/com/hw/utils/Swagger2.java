package com.hw.utils;/**
 * Created by robin on 2019/4/11.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: Robin
 * @create: 2019-04-11 11:03
 * @description: Swagger2 配置目录
 **/

@Configuration
@EnableSwagger2
public class Swagger2 {

    @Value("${swagger.enable}")
    private boolean enableSwagger;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(clientApiInfo())
                .enable(enableSwagger)
                .groupName("ALL")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hw.web"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo clientApiInfo() {
        return new ApiInfoBuilder()
                .title("gameapi")
                .description("hw-game V1.0")
                .termsOfServiceUrl("")
                .contact("我是谁")
                .version("1.0")
                .build();
    }

    @Bean
    public Docket createServerRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(serverApiInfo())
                .enable(enableSwagger)
                .groupName("server")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hw.web.server"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo serverApiInfo() {
        return new ApiInfoBuilder()
                .title("gameapi server")
                .description("hw-game V1.0")
                .termsOfServiceUrl("")
                .contact("我是谁")
                .version("1.0")
                .build();
    }
}
