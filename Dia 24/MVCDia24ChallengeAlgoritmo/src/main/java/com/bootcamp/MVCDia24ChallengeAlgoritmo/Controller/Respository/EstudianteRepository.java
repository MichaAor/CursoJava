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
        String url = "http://localhost:8081/estudiantes/Pcont/"+pagNum+"/"+pagSize;
        List<Estudiante> estudiantes = rt.getForObject(url,List.class);
        return estudiantes;
    }

    public int getTotalPagesPage(int pagNum,int pagSize){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes/PTPag/"+pagNum+"/"+pagSize;
        Integer obj = rt.getForObject(url,Integer.class);
        int total = obj;
        return total;
    }

    public long getTotalElementsPage(int pagNum,int pagSize){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes/PElPag/"+pagNum+"/"+pagSize;
        Long obj = rt.getForObject(url,Long.class);
        long total = obj;
        return total;
    }

    ///////////////////////////////////////////////////////////

    public List<Estudiante> getContentSort(int pagNum,int pagSize,String sort,String sortfield){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes/Scont/"+pagNum+"/"+pagSize+"/"+sort+"/"+sortfield;
        List<Estudiante> estudiantes = rt.getForObject(url,List.class);
        return estudiantes;
    }

    public int getTotalPagesSort(int pagNum,int pagSize,String sort,String sortfield){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes/STPag/"+pagNum+"/"+pagSize+"/"+sort+"/"+sortfield;
        Integer obj = rt.getForObject(url,Integer.class);
        int total = obj;
        return total;
    }

    public long getTotalElementsSort(int pagNum,int pagSize,String sort,String sortfield){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes/SElPag/"+pagNum+"/"+pagSize+"/"+sort+"/"+sortfield;
        Long obj = rt.getForObject(url,Long.class);
        long total = obj;
        return total;
    }

    ///////////////////////////////////////////////////////////





    public Estudiante getEstudianteByDni(long dni){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes/dni/"+dni;
        Estudiante estudiante = rt.getForObject(url,Estudiante.class);
        return estudiante;
    }

    public ArrayList<Estudiante> getEstudianteByNombre(String nombre){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes/nombre/"+nombre;
        ArrayList<Estudiante> estudiante = rt.getForObject(url,ArrayList.class);
        return estudiante;
    }

    public ArrayList<Estudiante> getEstudianteByApellido(String apellido){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/estudiantes/apellido/"+apellido;
        ArrayList<Estudiante> estudiante = rt.getForObject(url,ArrayList.class);
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
