package com.company;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class ModificarDatos {
    public static void modificar(MongoCollection< Document > userData, int dni){
            Document filter = new Document("Persona.dni", dni);
            Document set = new Document("$set: {nombre: }", "jorgelio");
            userData.updateMany(filter,set);
            System.err.println("PERSONA Eliminado");
        }
    }

