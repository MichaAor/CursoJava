package com.company.Vehiculos;

public class Carga extends Vehiculo{
    Remolque remolque = null;

    public Carga(String mat) {
        super(mat);
    }

    public void ponerRemolque(Remolque remolque){
        this.remolque =  remolque;
    }

    public void sacarRemolque(Remolque remolque){
        this.remolque = remolque;
    }

    public void acl(float kmsXh){
        if(kmsXh < 100) {
            super.acl(kmsXh);
        }else {
            try {
                throw new demRap("Se esta extendiendo la velocidad maxima");
            } catch (com.company.Vehiculos.demRap demRap) {
                demRap.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        if(this.remolque != null) {
            return super.toString() +
                    "\nRemolque: " + this.remolque.toString();
        }else {
            return super.toString();
        }
    }


}
