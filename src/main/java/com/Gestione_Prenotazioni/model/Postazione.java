package com.Gestione_Prenotazioni.model;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="Postazione")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Postazione {
	@ManyToOne
	@JoinColumn(name="id_edificio")
	private Edificio utente;
	@OneToMany(mappedBy="utente")
	private List<Utente> utenti;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String descrizionePostazione;
	private TipoPostazione Tipo;
	private Integer numeroMaxOccupanti;
//	private Edificio e;
}