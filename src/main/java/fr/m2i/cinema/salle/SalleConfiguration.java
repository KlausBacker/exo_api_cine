package fr.m2i.cinema.salle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SalleConfiguration {
	
	@Bean
	public SalleService salleService(SalleRepository repository) {
		return new SalleService(repository);
	}

}
