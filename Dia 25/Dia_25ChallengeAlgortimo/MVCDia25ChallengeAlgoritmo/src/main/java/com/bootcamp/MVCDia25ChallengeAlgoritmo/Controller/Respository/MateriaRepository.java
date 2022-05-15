package com.bootcamp.MVCDia25ChallengeAlgoritmo.Controller.Respository;

import com.bootcamp.MVCDia25ChallengeAlgoritmo.Model.Materia;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MateriaRepository{

    public ArrayList<Materia> getAllMateria(){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/materias";
        ArrayList<Materia> materias = rt.getForObject(url,ArrayList.class);
        return materias;
    }

    public List<Materia> getContentPage(int pagNum, int pagSize){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/materias/Pcont/"+pagNum+"/"+pagSize;
        List<Materia> materias = rt.getForObject(url,List.class);
        return materias;
    }

    public int getTotalPagesPage(int pagNum,int pagSize){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/materias/PTPag/"+pagNum+"/"+pagSize;
        Integer obj = rt.getForObject(url,Integer.class);
        int total = obj;
        return total;
    }

    public long getTotalElementsPage(int pagNum,int pagSize){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/materias/PElPag/"+pagNum+"/"+pagSize;
        Long obj = rt.getForObject(url,Long.class);
        long total = obj;
        return total;
    }

    ///////////////////////////////////////////////////////////

    public List<Materia> getContentSort(int pagNum,int pagSize,String sort,String sortfield){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/materias/Scont/"+pagNum+"/"+pagSize+"/"+sort+"/"+sortfield;
        List<Materia> materias = rt.getForObject(url,List.class);
        return materias;
    }

    public int getTotalPagesSort(int pagNum,int pagSize,String sort,String sortfield){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/materias/STPag/"+pagNum+"/"+pagSize+"/"+sort+"/"+sortfield;
        Integer obj = rt.getForObject(url,Integer.class);
        int total = obj;
        return total;
    }

    public long getTotalElementsSort(int pagNum,int pagSize,String sort,String sortfield){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/materias/SElPag/"+pagNum+"/"+pagSize+"/"+sort+"/"+sortfield;
        Long obj = rt.getForObject(url,Long.class);
        long total = obj;
        return total;
    }

    ///////////////////////////////////////////////////////////




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

    public List<Materia> getMateriasByNombre(String nombre){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/materias/nombre/"+nombre;
        List<Materia> materias = rt.getForObject(url,List.class);
        return materias;
    }
}
