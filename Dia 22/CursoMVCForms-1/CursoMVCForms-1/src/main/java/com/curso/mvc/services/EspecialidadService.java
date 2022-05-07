package com.curso.mvc.services;

import java.util.ArrayList;
import java.util.Optional;

import com.curso.mvc.repositories.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.mvc.models.Especialidad;


@Service
public class EspecialidadService {
	@Autowired
	EspecialidadRepository er;

	public ArrayList<Especialidad> findAll() {
		return (ArrayList<Especialidad>) er.findAll();
	}


	public Optional<Especialidad> findById(String id) {
		return er.findById(id);
	}


	public void save(Especialidad especialidad) {
		er.save(especialidad);
	}


	public void deleteById(String id) {
		er.deleteById(id);
	}

}
