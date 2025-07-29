package com.projects.swagger_doc.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI OpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("My Test Project")
                        .version("v.0.0.1")
                        .description("Test API Document")
                        .contact(new Contact()
                                .name("System Admin")
                                .email("systemadmin@info.com")
                                .url("mycompany.com")));
    }
}
