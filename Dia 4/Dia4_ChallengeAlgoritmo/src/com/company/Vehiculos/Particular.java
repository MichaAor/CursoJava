package com.company.Vehiculos;


public class Particular extends Vehiculo{
    private int puertas;

    public Particular(String mat,int puertas) {
        super(mat);
        this.puertas = puertas;
    }

    @Override
    public void acl(float kmsXh){
            super.acl(kmsXh);
    }

    public int getPuertas(){
        return this.puertas;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nPuertas: " + getPuertas();
    }
}
