package com.company.Service;

import com.company.MongoDBSingleton;
import com.mongodb.client.*;
import org.bson.Document;

public class ConsultarDatos {
    static MongoDBSingleton singleton = MongoDBSingleton.getInstance();
    public static void consultar(int dni) throws InterruptedException {
        MongoCollection<Document> personasData = singleton.getCollectionSingle();
        Thread.sleep(1000);
        Document document = new Document("Persona.dni", dni);
        FindIterable<Document> resultListar = personasData.find().filter(document);

        if (resultListar.first() != null) {
            for (Document doc : resultListar) {
                System.out.println(doc.toJson());
            }
        }else {
            System.out.println("No hay un registro que coincida con el campo ingresado");
        }
    }

    public static boolean existDNI(int dni) throws InterruptedException {
        MongoCollection<Document> personasData = singleton.getCollectionSingle();
        Thread.sleep(1000);
        Document document = new Document("Persona.dni", dni);
        FindIterable<Document> resultListar = personasData.find().filter(document);
        if(resultListar.first() != null){
            return true;
        }
        return false;
    }

}

