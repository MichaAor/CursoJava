package com.company.Challenge;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int identificacion;
    private String estadoCivil;

    public Persona(String nombre, String apellido, int identificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.estadoCivil = estadoCivil;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
    private void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void cambioEstadoCivil(String estadoCivil){
        this.setEstadoCivil(estadoCivil);
    }

    @Override
    public String toString() {
        return  "\n-----------------------------------------------------------\n"+
                this.getClass().getSimpleName() +
                "\nNombre: " + this.getNombre() +
                "\nApellido: " + this.getApellido() +
                "\nNumero de Identificacion: " + this.getIdentificacion() +
                "\nEstado Civil: " + this.getEstadoCivil();
    }
}
