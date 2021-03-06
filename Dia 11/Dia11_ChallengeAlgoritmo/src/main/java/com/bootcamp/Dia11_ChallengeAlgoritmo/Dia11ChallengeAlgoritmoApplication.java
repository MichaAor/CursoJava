package com.bootcamp.Dia11_ChallengeAlgoritmo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.bootcamp.Dia11_ChallengeAlgoritmo.Service.UsuarioService.*;

import java.io.IOException;
import java.util.Scanner;

import static com.bootcamp.Dia11_ChallengeAlgoritmo.Service.UsuarioService.*;

@SpringBootApplication
public class Dia11ChallengeAlgoritmoApplication {

	public static void main(String[] args) throws IOException {
		/*String nombre,apellido,dni;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese es su nombre");
		nombre = sc.nextLine();
		System.out.println("Ingrese es su apellido");
		apellido = sc.nextLine();
		System.out.println("Ingrese es su dni");
		dni = sc.nextLine();
		System.out.println(registrarUsuario(nombre,apellido,dni));*/
		//System.out.println(consultarUsuarios());
		//System.out.println(consultarUsuarioXdni("35224668"));
		//System.out.println(borrarUsuarioXdni("35224668"));
		SpringApplication.run(Dia11ChallengeAlgoritmoApplication.class, args);
	}

}
