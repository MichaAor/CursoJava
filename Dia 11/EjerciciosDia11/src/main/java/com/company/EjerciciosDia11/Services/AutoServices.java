package com.company.EjerciciosDia11.Services;

import com.company.EjerciciosDia11.Models.Auto;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;


public class AutoServices {
    public static String registrarAuto(String modelo, String marca, String patente,
                                     float precio, int cantPuertas) throws IOException {
        ArrayList<Auto> autos = leerAutosJSON();
        Auto auto = null;
        String str = "FALLO EL REGISTRO,INTENTE NUEVAMENTE";
        if(!consultarPatente(patente)){
            auto = new Auto(modelo, marca, patente, precio, cantPuertas);
            autos.add(auto);
            str = "SE REGISTRO EXITOSAMENTE";
        }
        guardarAutosJSON(autos);
        return str;
    }

    public static boolean consultarPatente(String patente) throws IOException {
        ArrayList<Auto> autos = leerAutosJSON();
        boolean rta = false;
        for(Auto auto : autos){
            if(auto.getPatente().compareTo(patente)==0){
                rta = true;
                break;
            }
        }
        return rta;
    }

    public static String consultarAuto(String patente) throws IOException {
        ArrayList<Auto> autos = leerAutosJSON();
        String rta = "No esta registrado ningun auto con esa patente";
        for(Auto auto : autos){
            if(auto.getPatente().compareTo(patente)==0){
               rta = auto.toString();
                break;
            }
        }
        return rta;
    }

    public static String borrarAuto(String patente) throws IOException {
        ArrayList<Auto> autos = leerAutosJSON();
        String rta = "No esta registrado ningun auto con esa patente";
        for(Auto auto : autos){
            if(auto.getPatente().compareTo(patente)==0){
                autos.remove(auto);
                rta = "Se ha encontrado y borrado con exito el auto";
                break;
            }
        }
        return rta;
    }


    ///Metodos GSON

    public static boolean guardarAutosJSON(ArrayList<Auto> autos) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Autos"));
        try{
            Gson gson = new Gson();
            gson.toJson(autos,new TypeToken<ArrayList<Auto>>() {}.getType(), bufferedWriter);
        }finally {
            bufferedWriter.close();
        }
        return true;
    }

    public static ArrayList<Auto> leerAutosJSON() throws IOException {
        ArrayList<Auto> autos = new ArrayList<Auto>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Autos"));
        try {
            Gson gson = new Gson();
            autos = gson.fromJson(bufferedReader, new TypeToken<ArrayList<Auto>>(){}.getType());
        } finally {
            bufferedReader.close();
        }
        return autos;
    }


}
