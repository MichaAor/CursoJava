package com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller.Respository;

import com.bootcamp.MVCDia24ChallengeAlgoritmo.Model.Materia;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Repository
public class MateriaRepository{

    public ArrayList<Materia> getAllMateria(){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/materias";
        ArrayList<Materia> materias = rt.getForObject(url,ArrayList.class);
        return materias;
    }

    public Materia getMateriaByCodMat(long dni){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/materias/"+dni;
        Materia materia = rt.getForObject(url,Materia.class);
        return materia;
    }

    public void saveMateria(Materia materia){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/materias";
        rt.postForObject(url,materia,Materia.class);
    }

    public void deleteMateria(long dni){
        String url = "http://localhost:8081/materias/delete/"+dni;
        RestTemplate rt = new RestTemplate();
        rt.delete(url);
    }

    public void modifyMateria(Materia materia,long dni){
        String url = "http://localhost:8081/materias/update/"+dni;
        RestTemplate rt = new RestTemplate();
        rt.postForObject(url,materia,Materia.class);
    }
}
