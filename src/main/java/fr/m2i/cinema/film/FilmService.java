package fr.m2i.cinema.film;

import java.util.List;

public class FilmService {

	/**
	 * Instance du repository film
	 */
	FilmRepository repository;

	/**
	 * constructeur du service film avec IOD du repository
	 * 
	 * @param repository
	 */
	public FilmService(FilmRepository repository) {
		this.repository = repository;
	}

	/**
	 * Retourner une liste de films
	 * 
	 * @return
	 */
	public List<Film> findAll() {
		return this.repository.findAll();
	}

	/**
	 * Retourner un film par son nom
	 * 
	 * @param nom
	 * @return
	 */
	public Film findByNom(String nom) {
		return this.repository.findByNom(nom);
	}

	/**
	 * Enregistrement et mise à jours de film
	 * 
	 * @param film
	 * @return
	 */
	public Film save(Film film) {
		return this.repository.save(film);
	}

	/**
	 * Suppression de film
	 * 
	 * @param film
	 */
	public void delete(Film film) {
		this.repository.delete(film);
	}

}
