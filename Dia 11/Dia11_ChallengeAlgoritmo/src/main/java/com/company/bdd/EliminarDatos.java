package com.company.bdd;

import com.mongodb.client.MongoCollection;
import org.bson.Document;


public class EliminarDatos {
    public static void eliminar(MongoCollection<Document> userData,int dni){
        Document document = new Document("Usuario.dni", dni);
        userData.findOneAndDelete(document);
        System.err.println("USER Eliminado");
    }
}
