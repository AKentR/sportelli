package com.corso.java.sportello3.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.corso.java.sportello3.entities.Persona;
import com.corso.java.sportello3.repository.PersonaRepository;

@Service
public class ServicePersonaImp implements ServicePersona{
	@Autowired
	
	PersonaRepository servicePersonaImp;
	@Override
	public void createPersona(Persona persona) {
		servicePersonaImp.save(persona);
		
	}

	@Override
	public void deletePersona(Integer id) {
		servicePersonaImp.deleteById(id);
	}

	@Override
	public Optional<Persona> searchPersona(Integer id) {
		Optional<Persona> persona= servicePersonaImp.findById(id);
		return persona;
	}

}
