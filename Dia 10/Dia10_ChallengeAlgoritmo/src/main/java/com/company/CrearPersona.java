package com.company;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Scanner;

public class CrearPersona {
    public static Persona registroDatos(MongoCollection<Document> personasData){
        Persona persona = new Persona();
        int dni = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el nombre: ");
                persona.setNombre(sc.nextLine());
            System.out.println("Ingrese el apellido: ");
                persona.setApellido(sc.nextLine());
            System.out.println("Ingrese el dni: ");
            dni = sc.nextInt();
            if(ConsultarDatos.existDNI(personasData,dni) == false) {
                persona.setDni(dni);
            }else {
                System.out.println("El dni ya esta registrado");
                return null;
            }
            sc = new Scanner(System.in);
            System.out.println("Ingrese la direccion: ");
                persona.setDireccion(sc.nextLine());
        return persona;
        }
}

