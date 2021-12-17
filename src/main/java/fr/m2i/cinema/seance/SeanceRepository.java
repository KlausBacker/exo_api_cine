package fr.m2i.cinema.seance;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeanceRepository extends MongoRepository<Seance, String> {

	/**
	 * Retourner une seance par sa date de debut
	 * 
	 * @param date
	 * @return
	 */
	List<Seance> findAllByDateDeDebut(Date date);

	/**
	 * Retourner une seance par le nom de son film
	 * 
	 * @param nom
	 * @return
	 */
	List<Seance> findAllByFilm_nom(String id);

	/**
	 * Retourner une seance par le numero de sa salle
	 * 
	 * @param numero
	 * @return
	 */
	List<Seance> findAllBySalle_numero(int numero);
}
