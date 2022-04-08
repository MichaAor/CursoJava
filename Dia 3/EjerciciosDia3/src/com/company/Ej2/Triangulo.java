package com.company.Ej2;

import java.util.Scanner;

public class Triangulo extends Forma {
    private float ladoA;
    private float ladoB;
    private float ladoC;


    @Override
    public float calcArea() {
        Scanner sc = new Scanner(System.in);
        if (this.tipo().compareTo("Equilatero") == 0) {
            System.out.println("Ingrese la altura");
            return (this.ladoB * sc.nextInt()) / 2;
        }else{
            if(this.tipo().compareTo("Isoceles") == 0){
                System.out.println("Ingrese la altura");
                return (this.retBase() * sc.nextInt()) / 2;
        }
        }
        return this.areaTriRec();
    }

    @Override
    public float calcPerimetro() {
        return this.ladoA + this.ladoB + this.ladoC;
    }

    public String tipo() {
        if (this.ladoA == this.ladoB && this.ladoB == this.ladoC && this.ladoA == this.ladoC) {
            return "Equilatero";
        } else {
            if (this.ladoA == this.ladoB ^ this.ladoB == this.ladoC ^ this.ladoA == this.ladoC) {
                return "Isoceles";
            } else {
                return "Rectangulo";
            }
        }
    }

    public float areaTriRec() {
        if (this.ladoA > this.ladoB) {
            if (this.ladoA < this.ladoC) {
                return (this.ladoB * this.ladoA) / 2;
            } else {
                return (this.ladoB * this.ladoC) / 2;
            }
        } else {
            if (this.ladoA < this.ladoC) {
                return (this.ladoB * this.ladoA) / 2 ;
            }else {return  (this.ladoB * this.ladoC) / 2;}
        }
    }

    public float retBase(){
        if(this.ladoA == this.ladoB ){
            return this.ladoC;
        }else {
            if(this.ladoA == this.ladoC){
                return this.ladoB;
            }
            else {
                return this.ladoA;
            }
        }
    }
}
