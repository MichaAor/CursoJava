package com.company;

import com.mongodb.client.*;
import org.bson.Document;

public class ListadoGeneral {
    public static void listarCollection(MongoCollection<Document> personasData){
        MongoCursor<Document> resultListar = personasData.find().iterator();
        while(resultListar.hasNext()){
                    System.out.println(resultListar.next().toJson());
        }
    }
}
