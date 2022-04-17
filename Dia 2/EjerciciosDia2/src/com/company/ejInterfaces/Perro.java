package com.company.ejInterfaces;

public class Perro implements Movilidad{
    private String nombre;
    private int cantPatas;
    private int años;

    @Override
    public String metrosEnTiempo() {
        return "El perro ha corrido 300 mts en 1 minuto";
    }
}
