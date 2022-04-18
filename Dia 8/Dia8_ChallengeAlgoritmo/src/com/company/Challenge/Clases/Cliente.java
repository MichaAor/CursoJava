package com.company.Challenge.Clases;

import java.sql.Date;

public class Cliente{
    private int idCliente;
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private Date fechaNac;

    public Cliente() {
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

    @Override
    public String toString() {
        return "\nCliente:" +
                "\nNombre=" + this.getNombre() +
                "\nApellido: " + this.getApellido() +
                "\nDNI: " + this.getDni() +
                "\nDireccion" + this.getDireccion() +
                "\nFecha de Nacimiento: " + this.getFechaNac();
    }


}
