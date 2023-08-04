package anchovy;

import java.util.Scanner;

public class Rest {
    Player player;

    public Rest(Player player){
        this.player = player;
    }
    Scanner sc = new Scanner(System.in);
    int maxHp = 100;
    Player rest(){
        while (player.hp<100){
            System.out.println("1.영양제 (LV.0) 2.아르기닌 (LV.5) 3.잠 (LV.10) 4.※약물※ (LV.20)");
            int kind = sc.nextInt();
            if (kind == 1){
                medicine();
            } else if (kind == 2){
                if (player.level<5){
                    System.out.println("레벨이 부족합니다.");
                } else {
                    arginine();
                }
            } else if (kind == 3){
                if (player.level <10){
                    System.out.println("레벨이 부족합니다.");
                } else {
                    sleeping();
                }
            } else if (kind == 4){
                if (player.level <20){
                    System.out.println("레벨이 부족합니다.");
                } else if (player.level >=20 && player.key == 0) {
                    System.out.println("로이더 잠금을 해제하시오");
                } else if (player.level >=20 && player.key == 1){
                    steroid();
                } else{
                    System.out.println("플레이 오류");
                    System.exit(1);
                }
            }
        }
        return player;
    }

    public void medicine(){
        if (player.hp<=90){
            player.hp += 10;
            System.out.println("HP가 10 늘었습니다!!");
        } else {
            player.hp = maxHp;
            System.out.println("Max HP!!");
        }
    }

    public void arginine(){
        if (player.hp<=75){
            player.hp += 25;
            System.out.println("HP가 25 늘었습니다!!");
        } else {
            player.hp = maxHp;
            System.out.println("Max HP!!");
        }
    }

    public void sleeping() {
        if (player.hp<=50){
            player.hp += 50;
            System.out.println("HP가 50 늘었습니다!!");
        } else {
            player.hp = maxHp;
            System.out.println("Max HP!!");
        }
    }

    public void steroid() {
        player.hp = 200;
        System.out.println("※\"로이더\"칭호 획득※");
        System.out.println("Max HP가 200으로 늘었습니다!!");
    }
}
