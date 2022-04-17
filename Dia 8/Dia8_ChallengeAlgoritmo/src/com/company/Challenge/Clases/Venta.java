package com.company.Challenge.Clases;

import java.sql.Date;

public class Venta {
    private Date fechaVenta;
    private int idCliente;
    private int idVendedor;


    public Venta() {}


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
}
