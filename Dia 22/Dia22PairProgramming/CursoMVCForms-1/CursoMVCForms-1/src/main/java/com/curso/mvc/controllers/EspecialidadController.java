package com.curso.mvc.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.curso.mvc.services.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.curso.mvc.models.Especialidad;


@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/especialidades")
public class EspecialidadController {
	@Autowired
	EspecialidadService es;

	@GetMapping("/list")
	public ArrayList<Especialidad> findAllEspecialidad(){
		return es.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Especialidad> getOne(@PathVariable String id) {
		return es.findById(id);
	}
	
	@PostMapping("/create")
	public void save(@RequestBody Especialidad especialidad) {
		es.save(especialidad);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		es.deleteById(id);
	}
}
