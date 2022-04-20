package com.bootcamp.EjerciciosDia11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Scanner;

import static com.bootcamp.EjerciciosDia11.Services.AutoServices.*;

@SpringBootApplication
public class EjerciciosDia11Application {

	public static void main(String[] args) throws IOException {
		/*String modelo,marca,patente;
		int cantPuertas; float precio;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese es su modelo");
		modelo = sc.nextLine();
		System.out.println("Ingrese es su marca");
		marca = sc.nextLine();
		System.out.println("Ingrese es su patente");
		patente = sc.nextLine();
		System.out.println("Ingrese es su cantidad de puertas");
		cantPuertas = sc.nextInt();
		System.out.println("Ingrese es su precio");
		precio = sc.nextFloat();
		System.out.println(registrarAuto(modelo,marca,patente,precio,cantPuertas));*/
		//System.out.println(consultarTodos());
		//System.out.println(consultarAuto("AMC-445"));
		//System.out.println(borrarAuto("AMC-445"));
		SpringApplication.run(EjerciciosDia11Application.class, args);
	}

}
