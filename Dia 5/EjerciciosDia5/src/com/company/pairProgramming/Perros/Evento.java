package com.company.pairProgramming.Perros;

import com.company.pairProgramming.Ladrar;

public class Evento {
    private Ladrar ladrar;


    public Evento(Ladrar ladrar) {
        this.ladrar = ladrar;
    }

    public void getLadrar() {
            this.ladrar.ladrar();
    }
}
