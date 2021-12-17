package fr.m2i.cinema.cinema;

import java.util.List;


public class CinemaService {

	/**
	 * Instance du repository cinéma
	 */
	CinemaRepository repository;

	/**
	 * constructeur du service cinéma avec IOD du repository
	 * 
	 * @param repository
	 */
	public CinemaService(CinemaRepository repository) {
		this.repository = repository;
	}

	/**
     * Retourner une liste de cinema
     * @return
     */
    public List<Cinema> findAll() {
        return this.repository.findAll();
    }

    /**
     * Retourner un cinéma par son nom
     * @param nom
     * @return
     */
    public Cinema findByNom(String nom) {
        return this.repository.findByNom(nom);
    }

    /**
     * Enregistrement et mise à jours de cinema
     * @param cinema
     * @return
     */
    public Cinema save(Cinema cinema) {
        return this.repository.save(cinema);
    }

    /**
     * Suppression de cinéma
     * @param cinema
     */
    public void delete(Cinema cinema) {
        this.repository.delete(cinema);
    }
	
}
