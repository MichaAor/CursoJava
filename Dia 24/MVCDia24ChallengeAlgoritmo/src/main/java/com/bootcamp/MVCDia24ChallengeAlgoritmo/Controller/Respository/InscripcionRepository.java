package com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller.Respository;


import com.bootcamp.MVCDia24ChallengeAlgoritmo.InscripcionRequest;
import com.bootcamp.MVCDia24ChallengeAlgoritmo.Model.Inscripcion;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Repository
public class InscripcionRepository{

    public ArrayList<Inscripcion> getAllInscripciones(){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/inscripciones";
        ArrayList<Inscripcion> inscripcions = rt.getForObject(url,ArrayList.class);
        return inscripcions;
    }

    public void saveInscripcion(InscripcionRequest inscripcionRequest){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/inscripciones";
        rt.postForObject(url,inscripcionRequest,InscripcionRequest.class);
    }

    public void deleteInscripcion(long id){
        String url = "http://localhost:8081/inscripciones/delete/"+id;
        RestTemplate rt = new RestTemplate();
        rt.delete(url);
    }

}
