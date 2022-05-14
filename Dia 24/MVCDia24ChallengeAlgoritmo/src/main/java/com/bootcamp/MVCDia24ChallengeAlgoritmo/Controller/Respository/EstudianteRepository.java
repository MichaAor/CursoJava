package com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller.Respository;


import com.bootcamp.MVCDia24ChallengeAlgoritmo.Model.Estudiante;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EstudianteRepository {

    public List<Estudiante> getAllEstudiantes(){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes";
        List<Estudiante> estudiantes = rt.getForObject(url,List.class);
        return estudiantes;
    }

    public List<Estudiante> getContentPage(int pagNum,int pagSize){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes/page/content/"+pagNum+"/"+pagSize;
        List<Estudiante> estudiantes = rt.getForObject(url,List.class);
        return estudiantes;
    }

    public int getTotalPagesPage(int pagNum,int pagSize){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes/page/tPage"+pagNum+"/"+pagSize;
        Integer obj = rt.getForObject(url,Integer.class);
        int total = obj;
        return total;
    }

    public long getTotalElementsPage(int pagNum,int pagSize){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes/page/tEl"+pagNum+"/"+pagSize;
        Long obj = rt.getForObject(url,Long.class);
        long total = obj;
        return total;
    }

    ///////////////////////////////////////////////////////////

    public List<Estudiante> getContentAsc(int pagNum,int pagSize){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes/asc/content"+pagNum+"/"+pagSize;
        List<Estudiante> estudiantes = rt.getForObject(url,List.class);
        return estudiantes;
    }

    public int getTotalPagesAsc(int pagNum,int pagSize){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes/asc/tPage"+pagNum+"/"+pagSize;
        Integer obj = rt.getForObject(url,Integer.class);
        int total = obj;
        return total;
    }

    public long getTotalElementsAsc(int pagNum,int pagSize){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes/asc/tEl"+pagNum+"/"+pagSize;
        Long obj = rt.getForObject(url,Long.class);
        long total = obj;
        return total;
    }

    ///////////////////////////////////////////////////////////
    public List<Estudiante> getContentDesc(int pagNum,int pagSize){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes/desc/content"+pagNum+"/"+pagSize;
        List<Estudiante> estudiantes = rt.getForObject(url,List.class);
        return estudiantes;
    }

    public int getTotalPagesDesc(int pagNum,int pagSize){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes/page/tPage"+pagNum+"/"+pagSize;
        Integer obj = rt.getForObject(url,Integer.class);
        int total = obj;
        return total;
    }

    public long getTotalElementsDesc(int pagNum,int pagSize){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes/page/tEl"+pagNum+"/"+pagSize;
        Long obj = rt.getForObject(url,Long.class);
        long total = obj;
        return total;
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
