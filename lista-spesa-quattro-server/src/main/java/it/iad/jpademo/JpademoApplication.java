package it.iad.lista_spesa_quattro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"it.iad.lista_spesa_quattro"})
@EnableJpaRepositories(basePackages= {"it.iad.lista_spesa_quattro"})
@EntityScan(basePackages= {"it.iad.lista_spesa_quattro"})
public class JpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}

}
