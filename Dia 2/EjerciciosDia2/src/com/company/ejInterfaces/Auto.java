package com.company.ejInterfaces;

public class Auto implements Movilidad{
    private String nombre;
    private float velocidadMaxima;
    private int puertas;

    @Override
    public String metrosEnTiempo() {
        return "El auto recorrio 4kms en 1 minuto a maxima velocidad";
    }
}
