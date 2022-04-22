package com.aviones.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aviones.models.AvionModel;
import com.aviones.repository.AvionesRepository;

@Service
public class AvionesService {

	@Autowired
	private AvionesRepository aRepository;
	
	public void save(AvionModel avion) {
		aRepository.save(avion);
	}
	
	public List<AvionModel> findAll(){
		return aRepository.findAll();
	}
	
	public Optional<AvionModel> findById(String matricula){
		return aRepository.findById(matricula);
	}
	
	public void deleteById(String matricula) {
		aRepository.deleteById(matricula);
	}
}
