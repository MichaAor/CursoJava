package com.company.ejPairProgramming;

public class Elf extends Unit{
    public Elf (){
        this.life = 500;
        this.atk = 40;
        this.prob = 70;
    }

    public int attack(){
        if((int) (Math.random() *100+1) <= this.prob){
            this.prob = this.prob + 8;
            return this.atk;
        }else{
            return 0;
        }
    }

}
