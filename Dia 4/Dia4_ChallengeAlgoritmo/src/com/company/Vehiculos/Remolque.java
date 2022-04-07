package com.company.Vehiculos;

public class Remolque {
    private int ruedas;
    private int peso;
    private float pesoCarga;

    public Remolque(){}

    public Remolque(int ruedas, int peso, float pesoCarga) {
        this.ruedas = ruedas;
        this.peso = peso;
        this.pesoCarga = pesoCarga;
    }


    public int getRuedas() {
        return ruedas;
    }
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getPesoCarga() {
        return pesoCarga;
    }
    public void setPesoCarga(float pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    @Override
    public String toString() {
        return "Remolque: " +
                "\nRuedas: " + this.ruedas +
                "\nPeso: " + this.peso +
                "\nPeso de Carga: " + this.pesoCarga;
    }
}
