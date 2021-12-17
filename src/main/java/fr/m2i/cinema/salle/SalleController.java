package fr.m2i.cinema.salle;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("salles")
public class SalleController {
	
	/**
	 * Instance du service salle
	 */
	SalleService service;

	/**
	 * constructeur du controller salle avec IOD du service
	 * 
	 * @param service
	 */
	public SalleController(SalleService service) {
		this.service = service;
	}

	/**
	 * Retourner unee liste de salle
	 * 
	 * @return String
	 */
	@GetMapping
	public List<Salle> findAll() {
		return service.findAll();
	}

	/**
	 * Retourner une salle par son numero
	 * 
	 * @param nom String
	 * @return String
	 */
	@GetMapping("{numero}")
	public Salle findByNom(@PathVariable int numero) {
		return this.service.findByNumero(numero);
	}

	/**
	 * Enregistrer une salle en BDD
	 * 
	 * @param salle Salle
	 * @return String
	 */
	@PostMapping
	public Salle save(@RequestBody Salle salle) {
		return this.service.save(salle);
	}

	/**
	 * Mise à jour de salle
	 * 
	 * @param salle Salle
	 * @return String
	 */
	@PutMapping
	public Salle update(@RequestBody Salle salle) {
		return this.service.save(salle);
	}

	/**
	 * Suppression de salle
	 * 
	 * @param salle
	 */
	@DeleteMapping
	public void delete(@RequestBody Salle salle) {
		this.service.delete(salle);
	}

}
