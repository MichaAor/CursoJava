package com.company;


import com.mongodb.client.*;
import org.bson.Document;

import java.util.*;

public class RegistrarDatos{
    public static void registrar(MongoCollection<Document> personasData){
            Persona persona = CrearPersona.registroDatos(personasData);
            if(persona != null) {
                personasData.insertOne(
                        new Document("Persona",
                                new Document().append("id", persona.getDni())
                                        .append("nombre", persona.getNombre())
                                        .append("apellido", persona.getApellido())
                                        .append("dni", persona.getDni())
                                        .append("direccion", persona.getDireccion())
                        ));
            }else {
                System.out.println("No se realizo el registro,vuelva a intentar.");
            }
    }
}
