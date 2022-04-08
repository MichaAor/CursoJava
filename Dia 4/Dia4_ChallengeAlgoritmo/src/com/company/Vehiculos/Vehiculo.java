package com.company.Vehiculos;

public class Vehiculo {
    protected String mat;
    protected float vel;


    public Vehiculo(String mat) {
        this.mat = mat;
        this.vel = 0    ;
    }
    public void acl(float kmsXh){
        this.vel = this.vel+ kmsXh;
    }


    @Override
    public String toString() {
        return "Vehiculo: " + this.getClass().getSimpleName() +
               "\nMatricula: " + this.mat +
                "\nVelocidad: " + this.vel;
    }
}
