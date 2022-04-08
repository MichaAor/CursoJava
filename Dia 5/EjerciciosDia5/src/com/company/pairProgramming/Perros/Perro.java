package com.company.pairProgramming.Perros;

public abstract class Perro {
    private String nombre;
    private String tamaño;
    private float peso;

    public Perro(String nombre, String tamaño, float peso) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "\nNombre: " + this.getNombre() +
                "\nTamaño: " + this.getTamaño() +
                "\nPeso: " + this.getPeso();
    }



    public enum tam{
        Pequeño,Mediano,Grande;
    }



}
