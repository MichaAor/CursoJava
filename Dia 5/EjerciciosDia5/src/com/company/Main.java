package com.company;
import com.company.pairProgramming.Perros.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Perro perro = new PastorAle("Jorgelio",Perro.tam.Grande.name(),20.0f);
        Perro perro1 = new Chihuahua("Manuel",Perro.tam.Pequeño.name(),6.0f);
        Perro perro2 = new Bulldog("Isaias",Perro.tam.Mediano.name(), 12.0f);
        ArrayList<Perro> perros = new ArrayList<>();
        perros.add(perro);  perros.add(perro1); perros.add(perro2);

        perro.setNombre("Jamon");

        for(Perro perr : perros){
            System.out.println(perr.toString());
        }

        Evento evento = new Evento((Chihuahua)perro1);

        if(evento != null){
            evento.getLadrar();
            ((Bulldog) perro2).infartarse();
        }

        if(perro instanceof PastorAle){
            ((PastorAle) perro).atacar();
            ((Bulldog) perro2).comer();
        }


    }
}
