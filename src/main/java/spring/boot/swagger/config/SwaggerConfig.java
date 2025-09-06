package spring.boot.swagger.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI custonOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("User API Service")
                                .description("This is the API Documentation for User Service.")
                                .version("v1.0.0")
                                .contact(new Contact()
                                        .name("Support Team")
                                        .email("support@gmail.com"))


                );
    }
}
