package com.bootcamp.EjerciciosDia11.Model;

public class Auto {
    private String modelo;
    private String marca;
    private int puertas;
    private String patente;

    public Auto(String modelo, String marca, int puertas,String patente) {
        this.modelo = modelo;
        this.marca = marca;
        this.puertas = puertas;
        this.patente = patente;
    }

    public Auto(String modelo) {
        this.modelo = modelo;
    }


    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "\nAuto:" +
                "\nModelo: " + this.getModelo() +
                "\nMarca: " + this.getMarca() +
                "\nPuertas: " + this.getPuertas() ;
    }


}
