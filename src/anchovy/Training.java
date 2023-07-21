package anchovy;

import java.util.Scanner;

public class Training {
    Player player;
    int hp, muscle, protein;
    public void Training(Player player){

    }
    public void benchpress(){
        this.muscle+=5;
        this.hp-=5;
    }

    public void inclinebenchpress(){
        this.muscle+=4;
        this.hp-=4;
    }

    public void dips(){
        this.muscle+=2;
        this.hp-=2;
    }

    public void chestpress(){
        this.muscle+=3;
        this.hp-=3;
    }

    public void fly(){
        this.muscle+=1;
        this.hp-=1;
    }

    public void mainMenu(int part){
        while(muscle<=100){
            Scanner sc = new Scanner(System.in);
            int menu;

            System.out.println("");
        }
    }

}
