package com.prueba.fonyou.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.fonyou.models.dao.ExamenDao;
import com.prueba.fonyou.models.entity.Examen;

@Service
public class ExamenServiceImpl implements IExamenService {

	
	@Autowired
	private ExamenDao examenDao;
	
	@Override
	public List<Examen> buscarExamenes() {
		
		return (List<Examen>) examenDao.findAll();
	}

	@Override
	public Examen crearExamen(Examen examen) {
		examenDao.save(examen);
		return null;
	}

}
