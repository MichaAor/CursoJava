package com.company.Challenge;

public abstract class Empleado extends Persona{
    private int anioIncorporacion;
    private int numDespacho;

    public Empleado(String nombre, String apellido, int identificacion, String estadoCivil,
                    int anioIncorporacion, int numDespacho) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }
    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }
    private void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    public void reasignacionDespacho(int numDespacho){
        this.setNumDespacho(numDespacho);
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nAño de Incorporacion: " + this.getAnioIncorporacion() +
                "\nNumero de Despacho: " + this.getNumDespacho();
    }
}

