package fr.m2i.cinema.seance;

import java.util.Date;
import java.util.List;

public class SeanceService {
	
	/**
	 * Instance du repository seance
	 */
	SeanceRepository repository;

	/**
	 * constructeur du service seance avec IOD du repository
	 * 
	 * @param repository
	 */
	public SeanceService(SeanceRepository repository) {
		this.repository = repository;
	}

	/**
	 * Retourner une liste de seances
	 * 
	 * @return
	 */
	public List<Seance> findAll() {
		return this.repository.findAll();
	}

	/**
	 * Retourner une seance par sa date de debut
	 * 
	 * @param dateDeDebut
	 * @return
	 */
	public List<Seance> findAllByDateDeDebut(Date dateDeDebut) {
		return this.repository.findAllByDateDeDebut(dateDeDebut);
	}
	
	/**
	 * Retourner une seance par le nom de son film
	 * 
	 * @param nom
	 * @return
	 */
	public List<Seance> findAllByFilm_nom(String nom) {
		return this.repository.findAllByFilm_nom(nom);
	}
	
	/**
	 * Retourner une seance par le numero de sa salle
	 * 
	 * @param numero
	 * @return
	 */
	public List<Seance> findAllBySalle_numero(int numero) {
		return this.repository.findAllBySalle_numero(numero);
	}

	/**
	 * Enregistrement et mise à jours de seance
	 * 
	 * @param seance
	 * @return
	 */
	public Seance save(Seance seance) {
		return this.repository.save(seance);
	}

	/**
	 * Suppression de seance
	 * 
	 * @param seance
	 */
	public void delete(Seance seance) {
		this.repository.delete(seance);
	}


}
