package com.company.Ej2;

public class Cuadrado extends Forma{
    public float lado;

    public Cuadrado(float lado){
        this.lado = (float) (Math.random() * 10 +1);
        this.area = calcArea();
        this.perimetro = calcPerimetro();
    }

    @Override
    public float calcArea() {
        return (float) (Math.pow(this.lado,2));
    }

    @Override
    public float calcPerimetro() {
        return this.lado * 4;
    }
}
