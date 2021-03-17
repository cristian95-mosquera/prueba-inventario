package pruebaInventario;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PruebaInventarioApplication {

	@Value("${server.allowedOrigins}")
	private String urlConsumidoresApiPermitidos;

	public static void main(String[] args) {
		SpringApplication.run(PruebaInventarioApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		String[] urlConsumidoresApiPermitidosSeparados = urlConsumidoresApiPermitidos.split(";");
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping(  "/**").allowedOrigins(urlConsumidoresApiPermitidosSeparados);
			}
		};
	}
}
