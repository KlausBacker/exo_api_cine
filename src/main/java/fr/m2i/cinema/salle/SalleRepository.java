package fr.m2i.cinema.salle;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalleRepository extends MongoRepository<Salle, String> {

	/**
	 * Retourner une salle par son numero
	 * 
	 * @param numero
	 * @return
	 */
	Salle findByNumero(int numero);

}
