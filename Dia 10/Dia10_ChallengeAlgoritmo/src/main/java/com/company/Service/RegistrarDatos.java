package com.company.Service;


import com.company.Models.Persona;
import com.company.MongoDBSingleton;
import com.mongodb.client.*;
import org.bson.Document;

public class RegistrarDatos{
    static MongoDBSingleton singleton = MongoDBSingleton.getInstance();
    public static void registrar() throws InterruptedException {
        MongoCollection<Document> personasData = singleton.getCollectionSingle();
        Thread.sleep(1000);
            Persona persona = CrearPersona.registroDatos();
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
