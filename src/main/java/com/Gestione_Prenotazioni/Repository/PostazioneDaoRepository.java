package com.Gestione_Prenotazioni.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Gestione_Prenotazioni.model.Postazione;
@Repository
public interface PostazioneDaoRepository extends CrudRepository<Postazione, Long> {

}