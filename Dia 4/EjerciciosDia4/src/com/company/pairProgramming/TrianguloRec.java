package com.company.pairProgramming;

public class TrianguloRec {
    private double catA;
    private double catB;
    private double catC;
    private double alpha;
    private double beta;
    private double area;
    private double perimetro;

    public TrianguloRec(float cat1, float cat2) {
        this.catA = cat1;
        this.catB = cat2;
        this.catC = calcHip();
        this.alpha = calcAlpha();
        this.beta = calcBeta();
        this.area = calcArea();
        this.perimetro = calcPerimetro();

    }

    private double calcHip() {
        return Math.sqrt((Math.pow((float)this.catA,2) + Math.pow((float)this.catB,2)));
    }

    private double calcArea(){
        return (catB * catA) / 2;
    }

    private double calcPerimetro(){
        return this.catA + this.catB + this.catC;
    }

    private double calcAlpha(){
        return Math.toDegrees(Math.atan(catB/catA));
    }

    private double calcBeta(){
        return Math.toDegrees(Math.atan(catA/catB));
    }

    public double getCatA() {
        return catA;
    }
    public double getCatB() {
        return catB;
    }
    public double getCatC() {
        return catC;
    }
    public double getAlpha() {
        return alpha;
    }
    public double getBeta() {
        return beta;
    }
    public double getArea() {
        return area;
    }
    public double getPerimetro() {
        return perimetro;
    }

    @Override
    public String toString() {
        return "/***Triangulo Rectangulo:***/" +
                "\nCatA: " + catA +
                "\nCatB=: " + catB +
                "\nCatC:" + catC +
                "\nAlpha: " + alpha +
                "\nBeta: " + beta +
                "\nArea: " + area +
                "\nPerimetro: " + perimetro;
    }

}
