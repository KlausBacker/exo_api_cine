package fr.m2i.cinema.cinema;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CinemaRepository extends MongoRepository<Cinema, String> {
	
	/**
	 * Retourner un cinéma par son nom
	 * @param nom
	 * @return
	 */
	Cinema findByNom(String nom);

}
