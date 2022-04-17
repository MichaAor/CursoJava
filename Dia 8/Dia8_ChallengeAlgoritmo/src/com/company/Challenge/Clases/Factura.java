package com.company.Challenge.Clases;

import java.util.ArrayList;

public class Factura {
    private int numFactura;
    private ArrayList<Integer> idVentas;
    private ArrayList<Integer> idProductos;

    public Factura() {}


    public int getNumFactura() {
        return numFactura;
    }
    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public ArrayList<Integer> getIdVentas() {
        return idVentas;
    }
    public void setIdVentas(ArrayList<Integer> idVentas) {
        this.idVentas = idVentas;
    }

    public ArrayList<Integer> getIdProductos() {
        return idProductos;
    }
    public void setIdProductos(ArrayList<Integer> idProductos) {
        this.idProductos = idProductos;
    }

}
