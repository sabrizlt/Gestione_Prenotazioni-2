package com.Gestione_Prenotazioni.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="Prenotazione")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder 
public class Prenotazione {
	@OneToOne(mappedBy="id")
	private Utente utente;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String Data;
	private Boolean Scadenza;
}