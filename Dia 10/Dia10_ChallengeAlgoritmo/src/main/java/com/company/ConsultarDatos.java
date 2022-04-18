package com.company;

import com.mongodb.client.*;
import org.bson.Document;

public class ConsultarDatos {
    public static void consultar(MongoCollection<Document> personasData,int dni) {
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

    public static boolean existDNI(MongoCollection<Document> personasData,int dni){
        Document document = new Document("Persona.dni", dni);
        FindIterable<Document> resultListar = personasData.find().filter(document);
        if(resultListar.first() != null){
            return true;
        }
        return false;
    }

}

