package com.company.Dia5_ChallengeAlgoritmo.Empresa;

import com.company.Dia5_ChallengeAlgoritmo.Vehiculo;

import java.util.ArrayList;

public class JefeZona extends Empleado{
    private String despacho;
    private Secretario secretario;
    private ArrayList<Vendedor> vendedores;
    private Vehiculo vehiculo;

    public JefeZona(String nombre, String apellido, String dni, String direccion,
                    int ant, String telefono, float salario,String despacho,
                    Secretario secretario,Vehiculo vehiculo) {
        super(nombre, apellido, dni, direccion, ant, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.vendedores = new ArrayList<>();
        this.vehiculo = vehiculo;
    }


    public String getDespacho() {
        return despacho;
    }
    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public Secretario getSecretario() {
        return secretario;
    }
    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }
    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void incrementarSalario(int porc) {
        super.incrementarSalario(20);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDespacho: '" + this.getDespacho() +
                "\nSecretario: " + this.getSecretario().toString() +
                this.getVehiculo().toString();
    }

    public void mostrarVendedores(){
        for(Vendedor vendedor : this.getVendedores()){
            System.out.println(vendedor.toString());
        }
    }

    public void darDeAlta(Vendedor vendedor){
        this.getVendedores().add(vendedor);
    }

    public void darDeBaja(String dni){
        for(Vendedor vendedor : this.getVendedores()){
            if(vendedor.getDni().compareTo(dni) ==0){
                this.getVendedores().remove(vendedor);
            }
        }
    }

    @Override
    public void imprimir() {
        super.imprimir();
        mostrarVendedores();
    }
}
