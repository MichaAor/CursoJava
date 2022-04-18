package com.company.Challenge.Clases;

public class Producto {
    private int codProd;
    private float precioUnit;
    private int cantidad;
    private int stockMin;

    public Producto(){}

    public int getCodProd() {
        return codProd;
    }
    public void setCodProd(int codProd) {
        this.codProd = codProd;
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

    @Override
    public String toString() {
        return "\nProducto: " +
                "\nCodigoo del Producto: " + this.getCodProd() +
                "\nPrecio Unitario: " + this.getPrecioUnit() +
                "\nCantidad: " + this.getCantidad() +
                "\nStock Minimo: " + this.getStockMin();
    }
}
