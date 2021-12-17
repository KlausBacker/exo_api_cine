package fr.m2i.cinema.cinema;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cinemas")
public class CinemaController {

	/**
	 * Instance du service cinéma
	 */
	CinemaService service;

	/**
	 * constructeur du controller cinéma avec IOD du service
	 * 
	 * @param service
	 */
	public CinemaController(CinemaService service) {
		this.service = service;
	}

	/**
	 * Retourner une liste eventuelle de cinéma
	 * 
	 * @return String
	 */
	@GetMapping
	public List<Cinema> findAll() {
		return service.findAll();
	}

	/**
	 * Retourner un cinéma par son nom
	 * 
	 * @param nom String
	 * @return String
	 */
	@GetMapping("{nom}")
	public Cinema findByNom(@PathVariable String nom) {
		return this.service.findByNom(nom);
	}

	/**
	 * Enregistrer un cinema en BDD
	 * 
	 * @param cinema Cinema
	 * @return String
	 */
	@PostMapping
	public Cinema save(@RequestBody Cinema cinema) {
		return this.service.save(cinema);
	}

	/**
	 * Mise à jour de cinéma
	 * 
	 * @param cinema Cinema
	 * @return String
	 */
	@PutMapping
	public Cinema update(@RequestBody Cinema cinema) {
		return this.service.save(cinema);
	}

	/**
	 * Suppression de cinéma
	 * 
	 * @param cinema
	 */
	@DeleteMapping
	public void delete(@RequestBody Cinema cinema) {
		this.service.delete(cinema);
	}
}
