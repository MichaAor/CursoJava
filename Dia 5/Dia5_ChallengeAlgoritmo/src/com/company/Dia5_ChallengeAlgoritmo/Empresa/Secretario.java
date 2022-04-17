package com.company.Dia5_ChallengeAlgoritmo.Empresa;

public class Secretario extends Empleado {
    private String despacho;
    private String numFax;

    public Secretario(String nombre, String apellido, String dni,
                      String direccion, int ant, String telefono,
                      float salario, String despacho, String numFax) {
        super(nombre, apellido, dni, direccion, ant, telefono, salario);
        this.despacho = despacho;
        this.numFax = numFax;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getNumFax() {
        return numFax;
    }

    public void setNumFax(String numFax) {
        this.numFax = numFax;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDespacho: " + this.getDespacho() +
                "\nNumero de Fax" + this.getNumFax();
    }

    public void incrementarSalario(int incrementar) {
        super.incrementarSalario(5);
    }

}


