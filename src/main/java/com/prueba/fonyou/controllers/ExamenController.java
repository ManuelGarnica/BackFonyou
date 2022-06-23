package com.prueba.fonyou.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.fonyou.models.entity.Examen;
import com.prueba.fonyou.models.entity.Preguntas;
import com.prueba.fonyou.models.service.IExamenService;

@RestController
@RequestMapping("/examen")
public class ExamenController {

	@Autowired
	private IExamenService iExamenService;
	
	@GetMapping("/listar")
	public List<Examen> consultaExamen(){
		return iExamenService.buscarExamenes();
	}
	@PostMapping("/crear")
	public String crearExamen(@RequestBody Examen examen){
		
		System.out.println("Examen"+examen.getNombre());
		System.out.println("Examen"+examen.getPreguntas().toString());
		//Set<Preguntas> ok=examen.getPreguntas();
		
		//for (Preguntas preguntas : ok) {
		//	System.out.println("Examen"+preguntas.getPregunta());
	//	}
		
		iExamenService.crearExamen(examen);
		return "Examen";
	}
}
