package anchovy;

import java.util.Scanner;

public class Food {
    Player player;
    public Food(Player player){
        this.player = player;
    }
    Scanner sc = new Scanner(System.in);
    Player eating(){
        while (player.protein<100){
            System.out.println("1.프로틴 (LV.0)\n2.닭고기 (LV.5)\n3.돼지고기 (LV.10)\n4.소고기 (LV.20)");
            int food = sc.nextInt();
            if(food==1){
                proteinPowder();
            } else if (food==2){
                if (player.level <5){
                    System.out.println("레벨이 부족합니다.");
                } else{
                chicken();
                }
            } else if (food==3){
                if (player.level <10){
                    System.out.println("레벨이 부족합니다.");
                } else{
                    pork();
                }
            } else if (food==4){
                if (player.level <20){
                    System.out.println("레벨이 부족합니다.");
                } else{
                    beef();
                }
            } else{
                System.out.println("올바른 번호를 입력하시오.");
            }
        }
        return player;
    }
    public void proteinPowder(){
        player.protein+=25;
        System.out.println("단백질이 25 늘었습니다!!");
    }

    public void chicken(){
        player.protein+=25;
        System.out.println("단백질이 30 늘었습니다!!");
    }

    public void pork(){
        player.muscle+=25;
        System.out.println("단백질이 35 늘었습니다!!");
    }

    public void beef(){
        player.muscle+=25;
        System.out.println("단백질이 40 늘었습니다!!");
    }


}



