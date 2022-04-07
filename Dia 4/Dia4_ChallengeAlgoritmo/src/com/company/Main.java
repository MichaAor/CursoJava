package com.company;

import com.company.Vehiculos.Carga;
import com.company.Vehiculos.Particular;
import com.company.Vehiculos.Remolque;
import com.company.Vehiculos.demRap;

public class Main {

    public static void main(String[] args) throws demRap {
        Carga carga = new Carga("axn-189");
        carga.acl(50.0f);
        Remolque remolque = new Remolque(4,200,0.0f);
        carga.ponerRemolque(remolque);
        System.out.println(carga.toString());

        Particular particular = new Particular("ptn-778",3);
        particular.acl(50.0f);
        System.out.println(particular.toString());
    }
}
