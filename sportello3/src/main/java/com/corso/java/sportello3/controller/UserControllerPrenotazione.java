package com.corso.java.sportello3.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.corso.java.sportello3.entities.Prenotazione;
import com.corso.java.sportello3.service.ServicePrenotazione;

@RestController
@RequestMapping("/prenotazioni/prenotazione")
public class UserControllerPrenotazione {
	@Autowired
	ServicePrenotazione servicePrenotazioneImp;
	

	
	@PostMapping("/creaPrenotazione")
	public void creaPrenotazione(@RequestBody Prenotazione prenotazione) {
		servicePrenotazioneImp.createPrenotazione(prenotazione);
	}
	@RequestMapping(value = "/deletePrenotazione/{id}", method = RequestMethod.DELETE)
	public void cancPrenotazione(@PathVariable Integer id) {
		servicePrenotazioneImp.deletePrenotazione(id);
	}
	@GetMapping("/printOnePrenotazione/{id}")
	public Optional<Prenotazione> getOnePrenotazione(@PathVariable Integer id) {
		return servicePrenotazioneImp.searchPrenotazione(id);
	}
}
