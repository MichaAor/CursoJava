package com.company.Service;

import com.company.MongoDBSingleton;
import com.mongodb.client.MongoCollection;
import org.bson.Document;


public class EliminarDatos {
    static MongoDBSingleton singleton = MongoDBSingleton.getInstance();
    public static void eliminar(int dni) throws InterruptedException {
        MongoCollection<Document> personasData = singleton.getCollectionSingle();
        Thread.sleep(1000);
        Document document = new Document("Persona.dni", dni);
        personasData.findOneAndDelete(document);
        System.out.println("Persona Eliminada");
    }
}
