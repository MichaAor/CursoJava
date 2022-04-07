package com.company.Vehiculos;


public class Particular extends Vehiculo{
    private int puertas;

    public Particular(String mat,int puertas) {
        super(mat);
        this.puertas = puertas;
    }

    @Override
    public void acl(float kmsXh) throws demRap{
        if(kmsXh < 100) {
            super.acl(kmsXh);
        }else {
            throw new demRap("Se esta extendiendo la velocidad maxima");
        }
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nPuertas: " + this.puertas;
    }
}
