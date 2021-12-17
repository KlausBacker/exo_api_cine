package fr.m2i.cinema.seance;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import fr.m2i.cinema.film.Film;
import fr.m2i.cinema.salle.Salle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class Seance {
	@Id
    private String id;
	private Date dateDeDebut;
	private Date dateDeFin;
	@DBRef
	private Film film;
	@DBRef
	private Salle salle;
}
