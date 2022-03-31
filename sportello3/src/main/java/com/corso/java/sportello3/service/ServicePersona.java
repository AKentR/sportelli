package com.corso.java.sportello3.service;

import java.util.Optional;

import com.corso.java.sportello3.entities.Persona;



public interface ServicePersona {

	public void createPersona(Persona persona);

	public void deletePersona(Integer id);

	public Optional<Persona> searchPersona(Integer id);

}
