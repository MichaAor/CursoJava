package com.company.Challenge.Clases;

import java.sql.Date;

public class Venta {
    private int numVenta;
    private Date fechaVenta;
    private int idCliente;
    private int idVendedor;

    public Venta(){}

    public int getNumVenta() {
        return numVenta;
    }
    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }
    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVendedor() {
        return idVendedor;
    }
    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    @Override
    public String toString() {
        return "\nVenta: " +
                "\nNumero de Venta: " + this.getNumVenta() +
                "\nFecha de Venta: " + this.fechaVenta +
                "\nID Cliente: " + this.idCliente +
                "\nID Vendedor: " + this.getIdVendedor();
    }
}
