package com.Gestione_Prenotazioni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.Gestione_Prenotazioni.model.Edificio;
import com.Gestione_Prenotazioni.model.Postazione;
import com.Gestione_Prenotazioni.model.Prenotazione;
import com.Gestione_Prenotazioni.model.TipoPostazione;
import com.Gestione_Prenotazioni.model.Utente;
import com.Gestione_Prenotazioni.service.UtenteService;

@Component
public class UtenteRunner implements ApplicationRunner {

	@Autowired 
	UtenteService userService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
//		System.out.println("UtenteRun");
//		Utente u = new Utente();
//		u.setUsername("ciao");
//		u.setNomeCompleto("ciao");
//		u.setEmail("Ciao");
//		userService.insertUtente(u);
//	System.out.println(u);
//		
//		
//		System.out.println("Visualizzazione di una prenotazione");
//		Prenotazione p = new Prenotazione();
//		p.setUtente(u);
//		p.setData("23/09/2001");
//		p.setScadenza(false);
//		userService.getPrenotazione(p);
//		System.out.println(p);
		
	
		//creazione di una postazione
		Postazione po = new Postazione();
		po.setDescrizionePostazione("Postzione comoda con vista sulla piazza");
		po.setTipo(TipoPostazione.SALARIUNIONI);
		po.setNumeroMaxOccupanti(8);
//		System.out.println(po);
		
		
	//Creazione di un Edificio
	Edificio e = new Edificio();
	e.setNomeEdificio("EdificioProva");
	e.setIndirizzoEdificio("via Prova");
	e.setCittaEdificio("Roma");
	System.out.println(e);
		
		
		
		userService.getPostazione(TipoPostazione.SALARIUNIONI,e);
		
		
	}

}