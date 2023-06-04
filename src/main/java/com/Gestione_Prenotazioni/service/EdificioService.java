package com.Gestione_Prenotazioni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gestione_Prenotazioni.Repository.EdificioDaoRepository;
import com.Gestione_Prenotazioni.Repository.UtenteDaoRepository;
import com.Gestione_Prenotazioni.model.Edificio;

@Service
public class EdificioService {
	@Autowired
	EdificioDaoRepository repoE;
	
	public void insertEdificio(Edificio  e) {        
		repoE.save(e);
	}

}