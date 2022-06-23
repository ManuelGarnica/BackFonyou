package com.prueba.fonyou.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="ptRespuestas")
public class Respuestas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="idRespuestas" )
	private int id;
	
	@Column(name ="ptRespuestas_ptExamen_IdExamen" )
	private int idExamen;
	
	@Column(name ="ptRespuestas_idPreguntas" )
	private int idPreguntas;
	
	@Column(name ="respuestasT" )
	private char resuestaT;
	
	@Column(name ="respuestaLarga" )
	private char respuestaLarga;
	
	@Column(name ="respuestaCorrecta" )
	private char respuestaCorrecta;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdExamen() {
		return idExamen;
	}

	public void setIdExamen(int idExamen) {
		this.idExamen = idExamen;
	}

	public int getIdPreguntas() {
		return idPreguntas;
	}

	public void setIdPreguntas(int idPreguntas) {
		this.idPreguntas = idPreguntas;
	}

	public char getResuestaT() {
		return resuestaT;
	}

	public void setResuestaT(char resuestaT) {
		this.resuestaT = resuestaT;
	}

	public char getRespuestaLarga() {
		return respuestaLarga;
	}

	public void setRespuestaLarga(char respuestaLarga) {
		this.respuestaLarga = respuestaLarga;
	}

	public char getRespuestaCorrecta() {
		return respuestaCorrecta;
	}

	public void setRespuestaCorrecta(char respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	
	
}
