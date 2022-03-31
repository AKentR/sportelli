package com.corso.java.sportello3.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prenotazioni")
public class Prenotazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	protected Integer id;
	protected String congnome;

	public Prenotazione() {

	}

	public Prenotazione(String congnome) {
		this.congnome = congnome;
	}

	public Prenotazione(Integer id, String congnome) {
		this.id = id;
		this.congnome = congnome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCongnome() {
		return congnome;
	}

	public void setCongnome(String congnome) {
		this.congnome = congnome;
	}

}
