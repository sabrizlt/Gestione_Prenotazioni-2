package com.Gestione_Prenotazioni.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="Utente")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Utente {
	@OneToOne
	@JoinColumn(name="id_prenotazione")
	private Prenotazione id;
	@ManyToOne
	@JoinColumn(name="id_postazione")
	private Postazione utente;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long Id;
	private String username;
	private String nomeCompleto;
	private String email;
}