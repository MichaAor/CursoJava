package com.company;

import com.company.Challenge.Clases.Persona;
import com.company.Challenge.Creacion.CamposPersona;
import com.company.Challenge.Creacion.FactoryClass;





public class Main {
    public static void main(String[] args) {
        /*ConnectionDB connectionDB = ConnectionDB.getInstance();
        //insert(connectionDB,createClient());
        select(connectionDB);*/
        Persona persona1 = FactoryClass.fabrica(1);
        persona1 = CamposPersona.registroDatos(persona1);
        System.out.println(persona1.toString());


    }
}
