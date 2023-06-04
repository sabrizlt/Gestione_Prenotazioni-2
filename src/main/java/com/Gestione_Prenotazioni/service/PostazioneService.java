package com.Gestione_Prenotazioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gestione_Prenotazioni.Repository.PostazioneDaoRepository;
import com.Gestione_Prenotazioni.model.Postazione;


@Service
public class PostazioneService {
@Autowired PostazioneDaoRepository repoPo;
	
	public void insertPostazione(Postazione p) {
		repoPo.save(p);
	}
	public Postazione getPostazioneById(Long t) {
		return repoPo.findById(t).get();
	}
	public void updatePostazione(Postazione p) {
		repoPo.save(p);
	}
	public void removePostazione(Postazione p) {
		repoPo.delete(p);
	}
	public List<Postazione> getAllPostazioni() {
		return (List<Postazione>) repoPo.findAll();
	}

}