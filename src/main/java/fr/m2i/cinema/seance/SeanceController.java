package fr.m2i.cinema.seance;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("seances")
public class SeanceController {

	/**
	 * Instance du service seance
	 */
	SeanceService service;

	/**
	 * constructeur du controller seance avec IOD du service
	 * 
	 * @param service
	 */
	public SeanceController(SeanceService service) {
		this.service = service;
	}

	/**
	 * Retourner unee liste de seance
	 * 
	 * @return String
	 */
	@GetMapping
	public List<Seance> findAll() {
		return service.findAll();
	}

	/**
	 * Retourner une seance par sa date de debut
	 * 
	 * @param dateDeDebut
	 * @return
	 */
	@GetMapping("{dateDeDebut}")
	public List<Seance> findAllByDateDeDebut(Date dateDeDebut) {
		return this.service.findAllByDateDeDebut(dateDeDebut);
	}

	/**
	 * Retourner une seance par le nom de son film
	 * 
	 * @param nom
	 * @return
	 */
	@GetMapping("{nom}")
	public List<Seance> findAllByFilm_nom(String nom) {
		return this.service.findAllByFilm_nom(nom);
	}

	/**
	 * Retourner une seance par le numero de sa salle
	 * 
	 * @param numero
	 * @return
	 */
	@GetMapping("{numero}")
	public List<Seance> findAllBySalle_numero(int numero) {
		return this.service.findAllBySalle_numero(numero);
	}

	/**
	 * Enregistrer une seance en BDD
	 * 
	 * @param seance Seance
	 * @return String
	 */
	@PostMapping
	public Seance save(@RequestBody Seance seance) {
		return this.service.save(seance);
	}

	/**
	 * Mise à jour de seance
	 * 
	 * @param seance Seance
	 * @return String
	 */
	@PutMapping
	public Seance update(@RequestBody Seance seance) {
		return this.service.save(seance);
	}

	/**
	 * Suppression de seance
	 * 
	 * @param seance
	 */
	@DeleteMapping
	public void delete(@RequestBody Seance seance) {
		this.service.delete(seance);
	}

}
