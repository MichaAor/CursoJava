package com.company.EJ5;

public class Jugador {
    private String nombre;
    private int pts;
    private String palabra;
    private String pista;

    public Jugador(String name) {
        this.nombre = name;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPts() {
        return pts;
    }
    public void setPts(int pts) {
        this.pts = pts;
    }

    public String getPalabra() {
        return palabra;
    }
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getPista() {
        return pista;
    }
    public void setPista(String pista) {
        this.pista = pista;
    }
}
