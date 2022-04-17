package com.company.ejPairProgramming;

public class Orc extends Unit{
    public Orc (){
        this.life = 150;
        this.atk = 100;
        this.prob = 30 ;
    }

    public int attack(){
        if((int) (Math.random() *100+1) <= this.prob){
            this.life = this.life + 15;
            return this.atk;
        }else{
            return 0;
        }
    }

}
