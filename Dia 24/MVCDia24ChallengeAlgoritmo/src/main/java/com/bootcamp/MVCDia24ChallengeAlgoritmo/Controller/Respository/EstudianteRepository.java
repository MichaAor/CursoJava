package com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller.Respository;


import com.bootcamp.MVCDia24ChallengeAlgoritmo.Model.Estudiante;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Repository
public class EstudianteRepository {

    public ArrayList<Estudiante> getAllEstudiantes(){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes";
        ArrayList<Estudiante> estudiantes = rt.getForObject(url,ArrayList.class);
        return estudiantes;
    }

    public Estudiante getEstudianteByDni(long dni){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes/"+dni;
        Estudiante estudiante = rt.getForObject(url,Estudiante.class);
        return estudiante;
    }

    public void saveEstudiante(Estudiante estudiante){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes";
        rt.postForObject(url,estudiante,Estudiante.class);
    }

    public void deleteEstudiante(long dni){
        String url = "http://localhost:8081/estudiantes/delete/"+dni;
        RestTemplate rt = new RestTemplate();
        rt.delete(url);
    }

    public void modifyEstudiante(Estudiante estudiante,long dni){
        String url = "http://localhost:8081/estudiantes/update/"+dni;
        RestTemplate rt = new RestTemplate();
        rt.postForObject(url,estudiante,Estudiante.class);
    }
}
