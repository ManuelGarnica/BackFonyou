package com.prueba.fonyou.models.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="ptPreguntas")
public class Preguntas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="idPreguntas" )
	private int id;
	
	@Column(name ="ptExamen_IdExamen" )
	private int idExamen;
	
	@Column(name ="preguntasT" )
	private String pregunta;
	
	@ManyToOne
    @JoinColumn(name = "ptExamen_IdExamen", insertable = false, updatable = false)
    private Examen examen;

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

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	
	
}
