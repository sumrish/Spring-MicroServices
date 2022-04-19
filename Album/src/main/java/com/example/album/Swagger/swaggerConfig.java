package com.example.album.Swagger;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2
@EnableSwagger2WebMvc
public class swaggerConfig {
    private ApiInfo metaData() {
        return new ApiInfoBuilder()
                .title("Sumrish - Spring MicroService")
                .description("API Documentation")
                .version("1.0.0")
                .license("")
                .build();
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.album"))
                .paths(PathSelectors.regex("/api/v1/.*"))
                .build().apiInfo(metaData());

    }
}