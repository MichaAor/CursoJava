package com.company.bdd;

import com.mongodb.client.*;
import org.bson.Document;

public class ListadoGeneral {
    public static void listarCollection(MongoCollection<Document> userData){
        MongoCursor<Document> resultListar = userData.find().iterator();
        while(resultListar.hasNext()){
                    System.out.println(resultListar.next().toJson());
        }
    }
}
