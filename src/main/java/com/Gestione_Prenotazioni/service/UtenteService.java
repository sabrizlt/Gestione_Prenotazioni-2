package com.Gestione_Prenotazioni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Gestione_Prenotazioni.Repository.UtenteDaoRepository;
import com.Gestione_Prenotazioni.model.Edificio;
import com.Gestione_Prenotazioni.model.Postazione;
import com.Gestione_Prenotazioni.model.Prenotazione;
import com.Gestione_Prenotazioni.model.TipoPostazione;
import com.Gestione_Prenotazioni.model.Utente;

@Service
public class UtenteService {
	@Autowired
	UtenteDaoRepository repoU;
	
	//metodo per inserire un utente
	public void insertUtente(Utente u) {        
		repoU.save(u);
	}
	
	//metodo per visualizzare una prenotazione attraverso l'utente
	public void getPrenotazione(Prenotazione p) { 
		System.out.println(p);
	}
	
	
	//Un utente può ricercare le postazioni indicando il tipo di postazione desiderato e la città di interesse. 
	public void getPostazione(TipoPostazione t, Edificio e) {
		Postazione p = new Postazione();
		p.setTipo(TipoPostazione.SALARIUNIONI);		 
		Edificio ed = new Edificio();
		ed.setCittaEdificio("Milano");
		System.out.println(p);
	}
		
//		Un utente può avere più prenotazioni in corso, 
//		ma non può prenotare più di una postazione per una particolare data. 
		public void isnertPrenotazione() {
		
			
		}
	


}