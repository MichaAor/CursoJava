package com.company.bdd;

import com.company.Model.VOUser;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.Scanner;

public class CrearVOUser {
    public static VOUser registroDatos(MongoCollection<Document> userData){
        VOUser VOUser = new VOUser();
        int dni = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el nombre: ");
                VOUser.setNombre(sc.nextLine());
            System.out.println("Ingrese el apellido: ");
                VOUser.setApellido(sc.nextLine());
            System.out.println("Ingrese el dni: ");
            dni = sc.nextInt();
            if(ConsultarDatos.existDNI(userData,dni) == false) {
                VOUser.setDni(dni);
            }else {
                System.out.println("El dni ya esta registrado");
                return null;
            }
            sc = new Scanner(System.in);
            System.out.println("Ingrese la direccion: ");
                VOUser.setDireccion(sc.nextLine());
        return VOUser;
        }
}

