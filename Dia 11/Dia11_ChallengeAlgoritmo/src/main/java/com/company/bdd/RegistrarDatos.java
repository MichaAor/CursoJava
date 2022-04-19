package com.company.bdd;


import com.company.Model.VOUser;
import com.mongodb.client.*;
import org.bson.Document;

public class RegistrarDatos{
    public static void registrar(MongoCollection<Document> userData){
            VOUser VOUser = CrearVOUser.registroDatos(userData);
            if(VOUser != null) {
                userData.insertOne(
                        new Document("Usuario",
                                new Document().append("id", VOUser.getDni())
                                        .append("nombre", VOUser.getNombre())
                                        .append("apellido", VOUser.getApellido())
                                        .append("dni", VOUser.getDni())
                                        .append("direccion", VOUser.getDireccion())
                        ));
            }else {
                System.out.println("No se realizo el registro,vuelva a intentar.");
            }
    }
}
