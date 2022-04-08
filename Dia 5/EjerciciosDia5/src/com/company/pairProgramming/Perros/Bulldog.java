package com.company.pairProgramming.Perros;

import com.company.pairProgramming.Comer;

public class Bulldog extends Perro implements Comer {
    public Bulldog(String nombre, String tamaño, float peso) {
        super(nombre, tamaño, peso);
    }

    @Override
    public void comer() {
        System.out.println("Esta comiendo");
    }

    public void infartarse(){
        System.out.println("El perro no se mueve");
    }

}
