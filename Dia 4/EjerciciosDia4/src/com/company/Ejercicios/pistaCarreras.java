package com.company.Ejercicios;

import java.util.ArrayList;

public class pistaCarreras {

    public pistaCarreras(){
        ArrayList<Vehiculo> vehiculos = cargarPart();
        for(Vehiculo vehiculo : vehiculos){

        }



    }
    public ArrayList<Vehiculo> cargarPart(){
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        for(int i =0; i<(int)(Math.random()*20+1 );i++){
            Vehiculo vehiculo = new Vehiculo();
            vehiculos.add(vehiculo);
        }
        return vehiculos;
    }

    class Vehiculo{
        private float velocidad;
        private float combustible;

        public Vehiculo(){
            this.velocidad = 0;
            this.combustible = 100;
        }

    }
}
