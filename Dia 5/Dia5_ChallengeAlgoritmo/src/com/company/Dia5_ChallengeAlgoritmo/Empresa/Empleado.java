package com.company.Dia5_ChallengeAlgoritmo.Empresa;

public class Empleado {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private int ant;
    private String telefono;
    private float salario;
    private Empleado supervisor;

    public Empleado(String nombre, String apellido, String dni, String direccion,
                    int ant, String telefono, float salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.ant = ant;
        this.telefono = telefono;
        this.salario = salario;
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

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAnt() {
        return ant;
    }
    public void setAnt(int ant) {
        this.ant = ant;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }
    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public void cambiarEmpleado(Empleado empleado){
        this.setSupervisor(empleado);
    }

    public void incrementarSalario(int porc){
        this.setSalario(this.getSalario() * (this.getAnt() / (porc / 100)));
    }
    public void imprimir(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "\nPuesto: " + this.getClass().getSimpleName() +
                "\nNombre: " + this.getNombre() +
                "\nApellido: " + this.getApellido() +
                "\nDni: " + this.getDni() +
                "\nDireccion: " + this.getDireccion() +
                "\nAntiguedad: " + this.getAnt() +
                "\nTelefono: '" + this.getTelefono() +
                "\nSalario: " + this.getSalario() +
                "\nSupervisor: " + this.getSupervisor().toString();
    }
}
