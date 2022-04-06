package com.company.ejPairProgramming;

import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Scanner;

public class Game {
    public static void playGame(){
        Player player = crearPlayer();
        System.out.println("\n");
        Player player2 = crearPlayer();

        do{
            player2.getUnit().setLife(player2.getUnit().getLife() - battle(player));
            player.getUnit().setLife(player.getUnit().getLife() - battle(player2));
        }while(player.getUnit().getLife() > 0 ^  player2.getUnit().getLife() > 0);

        if(player.getUnit().getLife() <= 0 && player2.getUnit().getLife() <= 0 ){
            System.out.println("Is a tie");
        }else
            if(player.getUnit().getLife() <= 0 ){
                System.out.println("Player 2 win");
            }else {
                System.out.println("Player 1 win");
            }



    }

    public static void upgrade(Player player, Unit unit){
        Scanner sc = new Scanner(System.in);
        System.out.println("///Upgrade your hero///");
        System.out.println("1.Life  \n 2.Atk    \n3.Prob");
        int sel = sc.nextInt();
        if(buy(player.getCoins(),sel)){
            switch (sel){
                case 1:
                    player.setCoins(player.getCoins()-10);
                    unit.life += 10;
                    break;
                case 2:
                    player.setCoins(player.getCoins()-15);
                    unit.atk += 10;
                    break;
                case 3:
                    player.setCoins(player.getCoins()-20);
                    unit.prob += 10;
                    break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
        }else {
            System.out.println("Don`t have enough coins");
        }

    }

    public static boolean buy(int coins,int sel){
        boolean rta = false;
        switch (sel){
            case 1:
                if(coins >= 10){
                    rta = true;
                }
                break;
            case 2:
                if(coins >= 15){
                    rta = true;
                }
                break;
            case 3:
                if(coins >= 20){
                    rta = true;
                }
                break;
            default:
                System.out.println("Invalid Selection");
                break;
        }
        return rta;
    }

    public static Unit select(){
        Scanner sc = new Scanner(System.in);
        Unit unit = new Unit();
        System.out.println("Select the hero: ");
        System.out.println("1.Human  \n 2.Orc    \n3.Elf");
        int sel = sc.nextInt();
        switch (sel){
                case 1:
                   unit = new Human();
                    break;
                case 2:
                   unit = new Orc();
                    break;
                case 3:
                    unit = new Elf();
                    break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
            return unit;
    }

    public static Player crearPlayer(){
        Scanner sc = new Scanner(System.in);    char rta = 's';
        System.out.println("Enter name player");   String name = sc.nextLine();
        Player player = new Player(name);
        player.setUnit(select());   player.view();
        return player;
    }

    public static Human castH(Unit unit){
        Human human = new Human();
        if(unit instanceof Human){
            human = (Human) unit;
        }
        return human;
    }
    public static Orc castO(Unit unit){
        Orc orc = new Orc();
        if(unit instanceof Orc){
            orc = (Orc) unit;
        }
        return orc;
    }
    public static Elf castE(Unit unit){
        Elf elf = new Elf();
        if(unit instanceof Elf){
            elf = (Elf) unit;
        }
        return elf;
    }

    public static int battle(Player fighter){
        int atk =0;

        if(fighter.getUnit() instanceof Human){
            Human human = castH(fighter.getUnit());
            atk = human.atk;
        }
        if(fighter.getUnit() instanceof Orc){
            Orc orc = castO(fighter.getUnit());
            atk = orc.atk;
        }
        if(fighter.getUnit() instanceof Elf){
            Elf elf = castE(fighter.getUnit());
            atk = elf.atk;
        }
        System.out.println(atk);
        return atk;
    }
}
