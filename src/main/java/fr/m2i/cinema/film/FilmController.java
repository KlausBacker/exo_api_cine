package fr.m2i.cinema.film;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("films")
public class FilmController {

	/**
	 * Instance du service film
	 */
	FilmService service;

	/**
	 * constructeur du controller film avec IOD du service
	 * 
	 * @param service
	 */
	public FilmController(FilmService service) {
		this.service = service;
	}

	/**
	 * Retourner une liste de film
	 * 
	 * @return String
	 */
	@GetMapping
	public List<Film> findAll() {
		return service.findAll();
	}

	/**
	 * Retourner un film par son nom
	 * 
	 * @param nom String
	 * @return String
	 */
	@GetMapping("{nom}")
	public Film findByNom(@PathVariable String nom) {
		return this.service.findByNom(nom);
	}

	/**
	 * Enregistrer un film en BDD
	 * 
	 * @param film Film
	 * @return String
	 */
	@PostMapping
	public Film save(@RequestBody Film film) {
		return this.service.save(film);
	}

	/**
	 * Mise à jour de film
	 * 
	 * @param film Film
	 * @return String
	 */
	@PutMapping
	public Film update(@RequestBody Film film) {
		return this.service.save(film);
	}

	/**
	 * Suppression de film
	 * 
	 * @param film
	 */
	@DeleteMapping
	public void delete(@RequestBody Film film) {
		this.service.delete(film);
	}

}
