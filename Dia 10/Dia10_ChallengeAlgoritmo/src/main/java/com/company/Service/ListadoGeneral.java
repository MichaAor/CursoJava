package com.company.Service;

import com.company.MongoDBSingleton;
import com.mongodb.client.*;
import org.bson.Document;

public class ListadoGeneral {
    static MongoDBSingleton singleton = MongoDBSingleton.getInstance();
    public static void listarCollection() throws InterruptedException {
        Thread.sleep(1000);
        MongoCollection<Document> personasData = singleton.getCollectionSingle();
        MongoCursor<Document> resultListar = personasData.find().iterator();
        while(resultListar.hasNext()){
                    System.out.println(resultListar.next().toJson());
        }
    }
}
