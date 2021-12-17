package fr.m2i.cinema.film;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilmConfiguration {

	@Bean
	public FilmService filmService(FilmRepository repository) {
		return new FilmService(repository);
	}
}
