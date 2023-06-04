package com.Gestione_Prenotazioni.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Gestione_Prenotazioni.model.Prenotazione;
@Repository
public interface PrenotazioneDaoRepository extends CrudRepository<Prenotazione, Long> {

}