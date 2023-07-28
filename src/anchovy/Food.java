package anchovy;

import java.util.Scanner;

public class Food {
    Player player;
    public Food(Player player){
        this.player = player;
    }
    Scanner sc = new Scanner(System.in);
    Player eating(){
        while (player.hp<100){
            System.out.println("1.프로틴\n2.닭고기\n3.돼지고기\n4.소고기");
            int food = sc.nextInt();
            if(food==1){
                proteinPowder();
            } else if (food==2){
                chicken();
            } else if (food==3){
                pork();
            } else if (food==4){
                beef();
            } else{
                System.out.println("올바른 번호를 입력하시오.");
            }
        }
        return player;
    }
    public void proteinPowder(){
        player.hp+=5;
        player.muscle+=5;
        System.out.println("HP가 5 닳았습니다!!");
        System.out.println("근육량이 5 늘었습니다!!");
    }

    public void chicken(){
        player.hp+=10;
        player.muscle+=10;
        System.out.println("HP가 10 닳았습니다!!");
        System.out.println("근육량이 10 늘었습니다!!");
    }

    public void pork(){
        player.hp+=15;
        player.muscle+=15;
        System.out.println("HP가 15 닳았습니다!!");
        System.out.println("근육량이 15 늘었습니다!!");
    }

    public void beef(){
        player.hp+=20;
        player.muscle+=20;
        System.out.println("HP가 20 닳았습니다!!");
        System.out.println("근육량이 20 늘었습니다!!");
    }


}



