package com.company.Challenge.Clases;

public class Vendedor extends Persona{
    private float salario;

    public Vendedor(){}

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }



    @Override
    public String toString() {
        return super.toString() +
                "Salario: " + this.getSalario();
    }
}
