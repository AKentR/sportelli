package com.corso.java.sportello3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corso.java.sportello3.entities.Persona;




@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{




}

