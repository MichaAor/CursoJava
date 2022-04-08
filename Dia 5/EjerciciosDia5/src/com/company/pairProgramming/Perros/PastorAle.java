package com.company.pairProgramming.Perros;

import com.company.pairProgramming.Atacar;
import com.company.pairProgramming.Comer;

public class PastorAle extends Perro implements Comer, Atacar {
    public PastorAle(String nombre, String tamaño, float peso) {
        super(nombre, tamaño, peso);
    }

    @Override
    public void atacar() {
        System.out.println("Esta atacando");
    }

    @Override
    public void comer() {
        System.out.println("Esta comiendo");
    }
}
