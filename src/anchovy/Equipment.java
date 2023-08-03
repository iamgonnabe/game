package anchovy;

import java.util.Scanner;

public class Equipment {
    Player player;

    public Equipment(Player player){
        this.player = player;
    }
    Scanner sc = new Scanner(System.in);
    Player equipment(){
        while(true){
            System.out.println("장비를 선택하시오. 1.스트랩 2.손목 보호대 3.무릎 보호대 4.팔꿈치 보호대 5.벨트 6.나가기");
            int kind = sc.nextInt();
            if (kind == 1){
                if (player.equip[0] == 1){
                    player.equip[0] = 0;
                    System.out.println("스트랩을 해제하였습니다.");
                } else {
                    player.equip[0] = 1;
                    System.out.println("스트랩을 장착하였습니다.");
                }
            } else if (kind == 2){
                if (player.level>=5){
                    if(player.equip[1] == 1){
                        player.equip[1] = 0;
                        System.out.println("손목 보호대를 해제하였습니다.");
                    } else {
                        player.equip[1] = 1;
                        System.out.println("손목 보호대를 장착하였습니다.");
                    }
                } else {
                    System.out.println("레벨이 부족합니다.");
                }
            } else if (kind == 3){
                if (player.level>=10){
                    if(player.equip[2] == 1){
                        player.equip[2] = 0;
                        System.out.println("무릎 보호대를 해제하였습니다.");
                    } else {
                        player.equip[2] = 1;
                        System.out.println("무릎 보호대를 장착하였습니다.");
                    }
                } else {
                    System.out.println("레벨이 부족합니다.");
                }
            } else if (kind == 4){
                if (player.level>=15){
                    if(player.equip[3] == 1){
                        player.equip[3] = 0;
                        System.out.println("팔꿈치 보호대를 해제하였습니다.");
                    } else {
                        player.equip[3] = 1;
                        System.out.println("팔꿈치 보호대를 장착하였습니다.");
                    }
                } else {
                    System.out.println("레벨이 부족합니다.");
                }
            } else if (kind == 5){
                if (player.level>=20){
                    if(player.equip[4] == 1){
                        player.equip[4] = 0;
                        System.out.println("벨트를 해제하였습니다.");
                    } else {
                        player.equip[4] = 1;
                        System.out.println("벨트를 장착하였습니다.");
                    }
                } else {
                    System.out.println("레벨이 부족합니다.");
                }
            } else if (kind == 6){
                break;
            } else {
                System.out.println("올바른 번호를 입력하시오.");
            }
        }
        return player;
    }
}
