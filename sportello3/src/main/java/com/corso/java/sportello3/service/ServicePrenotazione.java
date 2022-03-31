package com.corso.java.sportello3.service;

import java.util.Optional;


import com.corso.java.sportello3.entities.Prenotazione;

public interface ServicePrenotazione {
	public void createPrenotazione(Prenotazione prenotazione);

	public void deletePrenotazione(Integer id);

	public Optional<Prenotazione> searchPrenotazione(Integer id);
}
