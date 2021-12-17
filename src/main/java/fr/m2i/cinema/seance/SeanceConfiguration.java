package fr.m2i.cinema.seance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeanceConfiguration {
	
	@Bean
	public SeanceService seanceService(SeanceRepository repository) {
		return new SeanceService(repository);
	}

}
