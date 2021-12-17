package fr.m2i.cinema.film;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface FilmRepository extends MongoRepository<Film, String>{
	
	/**
	 * Retourner un film par son nom
	 * @param nom
	 * @return
	 */
	Film findByNom(String nom);


}
