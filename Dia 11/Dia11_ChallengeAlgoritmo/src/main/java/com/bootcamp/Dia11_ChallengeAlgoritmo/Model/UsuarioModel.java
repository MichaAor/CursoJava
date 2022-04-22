package com.bootcamp.Dia11_ChallengeAlgoritmo.Model;


public class UsuarioModel {
    private String nombre,apellido,dni;

    public UsuarioModel(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
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

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }


    @Override
    public String toString() {
        return "\nUsuario: " +
               "\nNombre: " + this.getNombre() +
               "\nApellido: " + this.getApellido() +
               "\nDni: " + this.getDni();
    }
}
