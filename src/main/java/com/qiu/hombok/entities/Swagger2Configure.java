package com.qiu.hombok.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger的配置类
 */
@Configuration
//开启swagger
@EnableSwagger2
public class Swagger2Configure {
    @Bean
    public Docket createApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage("com.qiu.hombok")).build();
    }
    @Bean
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("swagger2集成").description("restful 文档构建器").version("1.0").build();
    }
}
