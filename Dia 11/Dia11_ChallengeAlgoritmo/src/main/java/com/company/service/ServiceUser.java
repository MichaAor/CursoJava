package com.company.service;

import com.company.bdd.*;
import com.company.Model.VOUser;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("(/users")
public class ServiceUser {
    @POST
    @Path("/crear")             //endpoin para acceder
    @Consumes({MediaType.APPLICATION_JSON})     //q consume
    @Produces({MediaType.TEXT_PLAIN})           //que responde o retorna
    public void cargarDatos(MongoCollection<Document> userData){;
        RegistrarDatos.registrar(userData);
    }

    @GET
    @Path("/consultar/{id}")
    @Produces({MediaType.TEXT_PLAIN})
    public String consultaPorID(@PathParam("id") int idUser,MongoCollection<Document> userData){
        ConsultarDatos.consultar(userData,idUser);
        return  "su user";
    }

    @GET
    @Path("/consultar/")
    @Produces({MediaType.TEXT_PLAIN})     //APPLICATION_JSON: retorna json //TEXT_PLAIN: RETORNA TEXTO PLANO
    public String consultaGeneral(VOUser users,MongoCollection<Document> userData){
        ListadoGeneral.listarCollection(userData);
        return "Todos los datos";
    }

    @DELETE
    @Path("/borrar/{id}")
    @Produces({MediaType.TEXT_PLAIN})
    public String borrarPorID(@PathParam("id") int idUser,MongoCollection<Document> userData){
       EliminarDatos.eliminar(userData,idUser);
       return "BORRADO";
    }




}
