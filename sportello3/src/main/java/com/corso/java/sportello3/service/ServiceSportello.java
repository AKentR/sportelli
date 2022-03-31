package com.corso.java.sportello3.service;
import java.util.List;

import com.corso.java.sportello3.entities.Prenotazione;
public interface ServiceSportello {
	public void prenota(String cognome);
	public void estrai(Integer id);
	public void rinuncia(Integer id);
	public List<Prenotazione> tempAttesa(Integer id);
}
