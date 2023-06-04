package com.Gestione_Prenotazioni.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="Edificio")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder 
public class Edificio {
	@OneToMany(mappedBy="utente")
	private List<Postazione> postazione;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;
private String nomeEdificio;
private String indirizzoEdificio;
private String cittaEdificio;

}