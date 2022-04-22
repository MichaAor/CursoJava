package com.aviones.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "aviones")
public class AvionModel {
	
	@Id
	private String matricula;
	
	private String tamanio;
	private int cantidadDePasajeros;
	private int velocidadMaxima;
	
	
	
	
	public AvionModel() {
	}
	public AvionModel(String matricula, String tamanio, int cantidadDePasajeros, int velocidadMaxima) {
		this.matricula = matricula;
		this.tamanio = tamanio;
		this.cantidadDePasajeros = cantidadDePasajeros;
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public int getCantidadDePasajeros() {
		return cantidadDePasajeros;
	}
	public void setCantidadDePasajeros(int cantidadDePasajeros) {
		this.cantidadDePasajeros = cantidadDePasajeros;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
}
