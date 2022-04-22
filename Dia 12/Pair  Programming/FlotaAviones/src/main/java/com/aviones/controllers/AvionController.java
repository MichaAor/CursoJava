package com.aviones.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aviones.models.AvionModel;
import com.aviones.services.AvionesService;

@RestController
@RequestMapping("/aviones")
public class AvionController {

	@Autowired
	private AvionesService aService;
	
	@GetMapping
	public List<AvionModel> findAll(){
		return aService.findAll();
	}
	
	@GetMapping("/{matricula}")
	public AvionModel findById(@PathVariable String matricula) {
		return aService.findById(matricula).get();
	}
	
	@PostMapping
	public void save(@RequestBody AvionModel avion) {
		aService.save(avion);
	}
	
	@PutMapping
	public void update(@RequestBody AvionModel avion) {
		aService.save(avion);
	}
	
	@DeleteMapping("/{matricula}")
	public void delete(@PathVariable String matricula) {
		aService.deleteById(matricula);
	}
}
