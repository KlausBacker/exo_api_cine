package fr.m2i.cinema.salle;

import java.util.List;

public class SalleService {
	
	/**
	 * Instance du repository salle
	 */
	SalleRepository repository;

	/**
	 * constructeur du service salle avec IOD du repository
	 * 
	 * @param repository
	 */
	public SalleService(SalleRepository repository) {
		this.repository = repository;
	}

	/**
	 * Retourner une liste de salles
	 * 
	 * @return
	 */
	public List<Salle> findAll() {
		return this.repository.findAll();
	}

	/**
	 * Retourner une salle par son numéro
	 * 
	 * @param nom
	 * @return
	 */
	public Salle findByNumero(int numero) {
		return this.repository.findByNumero(numero);
	}

	/**
	 * Enregistrement et mise à jours de salle
	 * 
	 * @param salle
	 * @return
	 */
	public Salle save(Salle salle) {
		return this.repository.save(salle);
	}

	/**
	 * Suppression de salle
	 * 
	 * @param salle
	 */
	public void delete(Salle salle) {
		this.repository.delete(salle);
	}


}
