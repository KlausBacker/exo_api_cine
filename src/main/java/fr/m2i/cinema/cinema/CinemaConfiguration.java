package fr.m2i.cinema.cinema;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CinemaConfiguration {
	
	@Bean
	public CinemaService cinemaService(CinemaRepository repository) {
		return  new CinemaService(repository);
	}
	

}
