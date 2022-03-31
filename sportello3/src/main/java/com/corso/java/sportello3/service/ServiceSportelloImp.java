package com.corso.java.sportello3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.corso.java.sportello3.entities.Prenotazione;
import com.corso.java.sportello3.repository.PrenotazioneRepository;

public class ServiceSportelloImp implements ServiceSportello{
	@Autowired

	PrenotazioneRepository servicePrenotazioneImp;
	@Override
	public void prenota(String cognome) {
		
		
	}

	@Override
	public void estrai(Integer id) {
		
		
	}

	@Override
	public void rinuncia(Integer id) {
	
	}

	@Override
	public List<Prenotazione> tempAttesa(Integer id) {
		List<Prenotazione> lista = new ArrayList<Prenotazione>();
		lista.addAll(servicePrenotazioneImp.selActiveName(id));
		return lista ;
	}

}
