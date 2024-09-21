package detona.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info(title = "Detona Movies Api", version = "1",
		description = "API de listagem de filmes desenvolvida para você usar em seu projeto gratuitamente."))
@SpringBootApplication
public class DetonaMoviesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetonaMoviesApiApplication.class, args);
	}

}


