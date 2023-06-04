package com.Gestione_Prenotazioni.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Gestione_Prenotazioni.model.Edificio;
@Repository
public interface EdificioDaoRepository extends CrudRepository<Edificio, Long> {

}