package com.company;

public class Triangle {
    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle(float sideA,float sideB,float sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String typeTriangle(){
       if(sideA == sideB && sideB == sideC){
           return "Equilatero";
       }
       if(sideA == sideB || sideB ==sideC || sideA == sideC){
           return "Isoceles";
       }
       return "Escaleno";
    }

    public void showType(String rta){
        switch(rta){
            case "Equilatero":
                System.out.println("Es un triangulo Equilatero ");
                break;
            case "Isoceles":
                System.out.println("Es un triangulo Isoceles ");
                break;
            case "Escaleno":
                System.out.println("Es un triangulo Escaleno");
                break;
        }
    }
}
