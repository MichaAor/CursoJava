package com.company.Challenge;

public class Profesor extends Empleado{
    private String depa;

    public Profesor(String nombre, String apellido, int identificacion, String estadoCivil,
                    int anioIncorporacion, int numDespacho, String depa) {
        super(nombre, apellido, identificacion, estadoCivil, anioIncorporacion, numDespacho);
        this.depa = depa;
    }

    public String getDepa() {
        return depa;
    }
    private void setDepa(String depa) {
        this.depa = depa;
    }

    public void cambioDepa(String depa){
        this.setDepa(depa);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDepartamento: " + this.getDepa()+
                "\n-----------------------------------------------------------\n";
    }


}
