package com.company.Challenge.Clases;

import java.sql.Date;

public class Vendedor{
    private int idVendedor;
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private Date fechaNac;
    private float salario;

    public Vendedor() {}

    public int getIdVendedor() {
        return idVendedor;
    }
    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nVendedor:" +
                "\nNombre=" + this.getNombre() +
                "\nApellido: " + this.getApellido() +
                "\nDNI: " + this.getDni() +
                "\nDireccion" + this.getDireccion() +
                "\nFecha de Nacimiento: " + this.getFechaNac().toString()+
                "\nSalario: " + this.getSalario();
    }



}
