package com.tiantian.ticket.config;

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
 * @author wangshuai14
 * @date 2018/3/29
 * @Description: Swagger配置类
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createHealthRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("account")
                .useDefaultResponseMessages(false)
                .apiInfo(userApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.tiantian.ticket.controller.account"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo userApiInfo() {
        return new ApiInfoBuilder()
                .title("账户服务")
                .description("用户相关接口")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }
}
