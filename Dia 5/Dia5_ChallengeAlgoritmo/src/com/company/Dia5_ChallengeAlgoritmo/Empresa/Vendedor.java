package com.company.Dia5_ChallengeAlgoritmo.Empresa;

import com.company.Dia5_ChallengeAlgoritmo.Vehiculo;

import java.util.ArrayList;

public class Vendedor extends Empleado{
    private Vehiculo vehiculo;
    private String telefonoMovil;
    private String areaVentas;
    private ArrayList<String> clientes;
    private float porcentajeVentas;

    public Vendedor(String nombre, String apellido, String dni, String direccion,
                    int ant, String telefono, float salario, Vehiculo vehiculo,
                    String telefonoMovil, String areaVentas,float porcentajeVentas) {
        super(nombre, apellido, dni, direccion, ant, telefono, salario);
        this.clientes = new ArrayList<>();
        this.vehiculo = vehiculo;
        this.telefonoMovil = telefonoMovil;
        this.areaVentas = areaVentas;
        this.porcentajeVentas = porcentajeVentas;
    }


    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }
    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getAreaVentas() {
        return areaVentas;
    }
    public void setAreaVentas(String areaVentas) {
        this.areaVentas = areaVentas;
    }

    public ArrayList<String> getClientes() {
        return clientes;
    }
    public void setClientes(ArrayList<String> clientes) {
        this.clientes = clientes;
    }

    public float getPorcentajeVentas() {
        return porcentajeVentas;
    }
    public void setPorcentajeVentas(float porcentajeVentas) {
        this.porcentajeVentas = porcentajeVentas;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nTelefono Movil: " + telefonoMovil +
                "\nArea de Ventas: '" + areaVentas +
                "\nComision :" + porcentajeVentas +
                this.getVehiculo().toString();
    }

    public void darDeAlta(String cliente){
        this.getClientes().add(cliente);
    }

    public void darDeBaja(String cliente){
        this.getClientes().remove(cliente);
    }

    public void cambiarCoche(Vehiculo vehiculo){
        this.setVehiculo(vehiculo);
    }

    public void mostrarClientes(){
        System.out.println("//LISTA DE CLIENTES//");
        for(String cliente : this.clientes){
            System.out.println(cliente);
        }
    }

    @Override
    public void imprimir() {
        super.imprimir();
        mostrarClientes();
    }

    @Override
    public void incrementarSalario(int incrementar) {
        super.incrementarSalario(10);
    }
}
