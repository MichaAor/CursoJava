package com.company.ejPairProgramming;

public class Human extends Unit{

    public Human(){
        this.life = 100;
        this.atk = 50 ;
        this.prob = 50;
    }

    public int attack(){
        int str=0;
        if ((int)(Math.random()*100+1)<= this.prob){
            str= this.atk;
            if ((int)(Math.random() * 100+1) <= 20){  //hit twice
                str= this.atk*2;
            }
        }
        return str;
    }

}
