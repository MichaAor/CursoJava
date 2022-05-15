package com.bootcamp.MVCDia25ChallengeAlgoritmo.Controller.Respository;


import com.bootcamp.MVCDia25ChallengeAlgoritmo.InscripcionRequest;
import com.bootcamp.MVCDia25ChallengeAlgoritmo.Model.Inscripcion;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InscripcionRepository{

    public ArrayList<Inscripcion> getAllInscripciones(){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/inscripciones";
        ArrayList<Inscripcion> inscripciones = rt.getForObject(url,ArrayList.class);
        return inscripciones;
    }

    public List<Inscripcion> getContentPage(int pagNum, int pagSize){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/inscripciones/Pcont/"+pagNum+"/"+pagSize;
        List<Inscripcion> inscripciones = rt.getForObject(url,List.class);
        return inscripciones;
    }

    public int getTotalPagesPage(int pagNum,int pagSize){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/inscripciones/PTPag/"+pagNum+"/"+pagSize;
        Integer obj = rt.getForObject(url,Integer.class);
        int total = obj;
        return total;
    }

    public long getTotalElementsPage(int pagNum,int pagSize){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/inscripciones/PElPag/"+pagNum+"/"+pagSize;
        Long obj = rt.getForObject(url,Long.class);
        long total = obj;
        return total;
    }

    ///////////////////////////////////////////////////////////

    public List<Inscripcion> getContentSort(int pagNum,int pagSize,String sort,String sortfield){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/inscripciones/Scont/"+pagNum+"/"+pagSize+"/"+sort+"/"+sortfield;
        List<Inscripcion> inscripciones = rt.getForObject(url,List.class);
        return inscripciones;
    }

    public int getTotalPagesSort(int pagNum,int pagSize,String sort,String sortfield){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/inscripciones/STPag/"+pagNum+"/"+pagSize+"/"+sort+"/"+sortfield;
        Integer obj = rt.getForObject(url,Integer.class);
        int total = obj;
        return total;
    }

    public long getTotalElementsSort(int pagNum,int pagSize,String sort,String sortfield){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/inscripciones/SElPag/"+pagNum+"/"+pagSize+"/"+sort+"/"+sortfield;
        Long obj = rt.getForObject(url,Long.class);
        long total = obj;
        return total;
    }
    //////////////////////////////////////////////

    public List<Inscripcion> getInsByMatNomb(String nombre){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/inscripciones/materia/"+nombre;
        List<Inscripcion> inscripciones = rt.getForObject(url,List.class);
        return inscripciones;
    }

    public List<Inscripcion> getInsByEstNomb(String nombre){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/inscripciones/estudiante/"+nombre;
        List<Inscripcion> inscripciones = rt.getForObject(url,List.class);
        return inscripciones;
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
