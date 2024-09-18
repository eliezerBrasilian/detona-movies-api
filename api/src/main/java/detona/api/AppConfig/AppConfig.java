package detona.api.AppConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public @Configuration
class AppConfig implements WebMvcConfigurer {

    @Value("${cors.originPatterns}")
    private String originPatterns;

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry){
        var allowedOrigins = originPatterns.split(",");

        corsRegistry
                .addMapping("/**")
                .allowedMethods("*")
                .allowedOrigins(allowedOrigins)
                .allowCredentials(true);
    }
}

