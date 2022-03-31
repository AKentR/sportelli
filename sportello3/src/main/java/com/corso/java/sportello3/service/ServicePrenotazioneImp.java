package com.corso.java.sportello3.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corso.java.sportello3.entities.Prenotazione;
import com.corso.java.sportello3.repository.PrenotazioneRepository;

@Service
public class ServicePrenotazioneImp implements ServicePrenotazione{
	@Autowired

	PrenotazioneRepository servicePrenotazioneImp;
	@Override
	public void createPrenotazione(Prenotazione prenotazione) {
		servicePrenotazioneImp.save(prenotazione);
		
	}

	@Override
	public void deletePrenotazione(Integer id) {
		servicePrenotazioneImp.deleteById(id);
	}

	@Override
	public Optional<Prenotazione> searchPrenotazione(Integer id) {
		Optional<Prenotazione> Prenotazione= servicePrenotazioneImp.findById(id);
		return Prenotazione;
	}

}
