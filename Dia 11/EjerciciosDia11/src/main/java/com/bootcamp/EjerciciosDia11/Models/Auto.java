package com.bootcamp.EjerciciosDia11.Models;

public class Auto {
    private String modelo,marca,patente;
    private float precio;
    private int cantPuertas;

    public Auto(){}

    public Auto(String modelo, String marca, String patente, float precio, int cantPuertas) {
        this.modelo = modelo;
        this.marca = marca;
        this.patente = patente;
        this.precio = precio;
        this.cantPuertas = cantPuertas;
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

    public int getCantPuertas() {
        return cantPuertas;
    }
    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }

    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "\nAuto: " +
                "\nModelo: " + this.getModelo() +
                "\nMarca: " + this.getMarca() +
                "\nCantidad de Puertas: " + this.getCantPuertas() +
                "\nPatente: " + this.getPatente() +
                "\nPrecio: " + this.getPrecio();
    }
}
