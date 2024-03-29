package items.infra.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
                .info(info());
    }

    private Info info() {
        return new Info()
                .title("Items API")
                .description("Items Management Application Documentation API")
                .license(new License().name("Apache 2.0").url("https://springdoc.org"))
                .version("1.0");
    }
}
