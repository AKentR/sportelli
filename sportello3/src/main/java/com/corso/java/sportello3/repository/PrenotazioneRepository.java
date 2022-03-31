package com.corso.java.sportello3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.corso.java.sportello3.entities.Prenotazione;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Integer>{
	@Query(nativeQuery = true, value = "SELECT * FROM `prenotazioni` WHERE prenotazioni.n_prenotazione>?1")
	List<Prenotazione> selActiveName(Integer id);
}
