package com.prueba.fonyou.models.service;

import java.util.List;

import com.prueba.fonyou.models.entity.Examen;

public interface IExamenService {

	public List<Examen> buscarExamenes();
	
	public Examen crearExamen(Examen examen);
	
	
}
