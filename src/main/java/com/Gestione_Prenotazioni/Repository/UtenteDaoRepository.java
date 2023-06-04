package com.Gestione_Prenotazioni.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Gestione_Prenotazioni.model.Prenotazione;
import com.Gestione_Prenotazioni.model.Utente;
@Repository
public interface UtenteDaoRepository extends CrudRepository<Utente, Long> {

	

}