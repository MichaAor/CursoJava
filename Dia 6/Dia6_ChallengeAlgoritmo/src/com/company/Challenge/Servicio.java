package com.company.Challenge;

public class Servicio extends Empleado{
    private String seccion;

    public Servicio(String nombre, String apellido, int identificacion, String estadoCivil,
                    int anioIncorporacion, int numDespacho, String seccion) {
        super(nombre, apellido, identificacion, estadoCivil, anioIncorporacion, numDespacho);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void trasladoSeccion(String seccion){
        this.setSeccion(seccion);
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nSeccion: " + this.getSeccion()+
                "\n-----------------------------------------------------------\n";
    }
}
