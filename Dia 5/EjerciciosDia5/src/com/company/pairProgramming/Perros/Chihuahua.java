package com.company.pairProgramming.Perros;

import com.company.pairProgramming.Comer;
import com.company.pairProgramming.Ladrar;

public class Chihuahua extends Perro implements Comer, Ladrar {

    public Chihuahua(String nombre, String tamaño, float peso) {
        super(nombre, tamaño, peso);
    }

    @Override
    public void comer() {
        System.out.println("Esta comiendo");
    }

    @Override
    public void ladrar() {
        System.out.println("Esta ladrando");
    }
}
