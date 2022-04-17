package com.company.Challenge;

public class Estudiante extends Persona{
    private String cursoMat;

    public Estudiante(String nombre, String apellido, int identificacion,
                      String estadoCivil, String cursoMat) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.cursoMat = cursoMat;
    }

    public String getCursoMat() {
        return cursoMat;
    }
    private void setCursoMat(String cursoMat) {
        this.cursoMat = cursoMat;
    }

    public void matricularNuevoCurso(String cursoMat){
        this.setCursoMat(cursoMat);
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nCursos Matriculados: '" + this.getCursoMat()+
                "\n-----------------------------------------------------------\n";
    }
}
