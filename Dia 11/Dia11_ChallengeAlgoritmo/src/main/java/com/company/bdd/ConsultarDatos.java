package com.company.bdd;

import com.mongodb.client.*;
import org.bson.Document;

public class ConsultarDatos {
    public static void consultar(MongoCollection<Document> userData,int dni) {
        Document document = new Document("Usuario.dni", dni);
        FindIterable<Document> resultListar = userData.find().filter(document);

        if (resultListar.first() != null) {
            for (Document doc : resultListar) {
                System.out.println(doc.toJson());
            }
        }else {
            System.out.println("No hay un registro que coincida con el campo ingresado");
        }
    }

    public static boolean existDNI(MongoCollection<Document> userData,int dni){
        Document document = new Document("Usuario.dni", dni);
        FindIterable<Document> resultListar = userData.find().filter(document);
        if(resultListar.first() != null){
            return true;
        }
        return false;
    }

}

