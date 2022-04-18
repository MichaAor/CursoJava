package com.company;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class EliminarDatos {
    public static void eliminar(MongoCollection<Document> personasData,int dni){
        Document document = new Document("Persona.dni", dni);
        personasData.findOneAndDelete(document);
        System.out.println("Persona Eliminada");
    }
}
