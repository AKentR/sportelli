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

import com.corso.java.sportello3.entities.Persona;
import com.corso.java.sportello3.service.ServicePersona;

@RestController
@RequestMapping("/prenotazioni/persona")
public class UserControllerPersona {
	@Autowired
	ServicePersona servicePersonaImp;

	
	@PostMapping("/creaPersona")
	public void creaPersona(@RequestBody Persona persona) {
		servicePersonaImp.createPersona(persona);
	}
	@RequestMapping(value = "/deletePersona/{cognome}", method = RequestMethod.DELETE)
	public void cancPersona(@PathVariable Integer id) {
		servicePersonaImp.deletePersona(id);
	}
	@GetMapping("/printOnePersona/{id}")
	public Optional<Persona> getOnePersona(@PathVariable Integer id) {
		return servicePersonaImp.searchPersona(id);
	}
}
