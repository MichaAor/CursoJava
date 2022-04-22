package com.company.Models;

import java.sql.Date;

public class Persona {
    private int idCliente;
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;

    public Persona() {}

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

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "\nPersona:" +
                "\nNombre=" + this.getNombre() +
                "\nApellido: " + this.getApellido() +
                "\nDNI: " + this.getDni() +
                "\nDireccion" + this.getDireccion();
    }
}
