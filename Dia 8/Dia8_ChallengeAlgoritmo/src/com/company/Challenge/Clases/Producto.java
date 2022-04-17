package com.company.Challenge.Clases;

public class Producto {
    private int codigoProd;
    private float precioUnit;
    private int cantidad;
    private int stockMin;

    public int getCodigoProd() {
        return codigoProd;
    }
    public void setCodigoProd(int codigoProd) {
        this.codigoProd = codigoProd;
    }

    public float getPrecioUnit() {
        return precioUnit;
    }
    public void setPrecioUnit(float precioUnit) {
        this.precioUnit = precioUnit;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getStockMin() {
        return stockMin;
    }
    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }
}
