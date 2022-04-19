package com.company.bdd;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class ModificarDatos {
    public static void modificar(MongoCollection< Document > userData, int dni){
            Document filter = new Document("Usuario.dni", dni);
            Document set = new Document("$set: nombre:","Carlos");
            userData.updateMany(filter,set);
            System.err.println("USER Eliminado");
        }
    }

