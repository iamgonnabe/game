package anchovy;

import java.util.Scanner;

public class Training {
    Player player;
    public Training(Player player) {
        this.player = player;
    }

    Scanner sc = new Scanner(System.in);

    Player mainMenu() {
        while (player.hp > 50) {
            System.out.println("1.가슴\n2.등\n3.하체\n4.어깨\n5.팔");
            int part = sc.nextInt();
            if (part == 1) {
                System.out.println("1.벤치프레스\n2.인클라인벤치프레스\n3.체스트프레스\n4.딥스\n5.플라이");
                int kind = sc.nextInt();
                Chest chest = new Chest(player);
                if (kind == 1) {
                    chest.benchPress();
                    System.out.println(player.hp);
                    System.out.println(player.muscle);
                } else if (kind == 2) {
                    chest.inclineBenchPress();
                } else if (kind == 3) {
                    chest.chestPress();
                } else if (kind == 4) {
                    chest.dips();
                } else if (kind == 5) {
                    chest.fly();
                } else {
                    System.out.println("올바른 번호를 입력하시오.");
                }
            } else if (part == 2) {
                System.out.println("1.풀업\n2.데드리프트\n3.랫풀다운\n4.덤벨로우\n5.시티드로우");
                int kind = sc.nextInt();
                Back back = new Back(player);
                if (kind == 1) {
                    back.pullUp();
                } else if (kind == 2) {
                    back.deadLift();
                } else if (kind == 3) {
                    back.latPulldown();
                } else if (kind == 4) {
                    back.dumbbellLow();
                } else if (kind == 5) {
                    back.seatedRow();
                } else {
                    System.out.println("올바른 번호를 입력하시오.");
                }
            } else if (part == 3) {
                System.out.println("1.스쿼트\n2.레그프레스\n3.레그익스텐션\n4.레그컬\n5.힙어브덕션");
                int kind = sc.nextInt();
                Leg leg = new Leg(player);
                if (kind == 1) {
                    leg.squat();
                } else if (kind == 2) {
                    leg.legPress();
                } else if (kind == 3) {
                    leg.legExtension();
                } else if (kind == 4) {
                    leg.legCurl();
                } else if (kind == 5) {
                    leg.hipAbduction();
                } else {
                    System.out.println("올바른 번호를 입력하시오.");
                }
            } else if (part == 4) {
                System.out.println("1.오버헤드프레스\n2.숄더프레스\n3.리버스팩덱\n4.사이드레터럴레이즈\n5.벤트오버레터럴레이즈");
                int kind = sc.nextInt();
                Shoulder shoulder = new Shoulder(player);
                if (kind == 1) {
                    shoulder.overHeadPress();
                } else if (kind == 2) {
                    shoulder.shoulderPress();
                } else if (kind == 3) {
                    shoulder.riversePecDeck();
                } else if (kind == 4) {
                    shoulder.sideLateralRaise();
                } else if (kind == 5) {
                    shoulder.bentOverLateralRaise();
                } else {
                    System.out.println("올바른 번호를 입력하시오.");
                }
            } else if (part == 5) {
                System.out.println("1.라잉트라이셉스익스텐션\n2.케이블프레스다운\n3.덤벨컬\n4.해머컬");
                int kind = sc.nextInt();
                Arm arm = new Arm(player);
                if (kind == 1) {
                    arm.lyingTricepsExtension();
                } else if (kind == 2) {
                    arm.cablePressDown();
                } else if (kind == 3) {
                    arm.dumbbellCurl();
                } else if (kind == 4) {
                    arm.happerCurl();
                } else {
                    System.out.println("올바른 번호를 입력하시오.");
                }
            }
        }
        return player;
    }
    /*void benchPress() {
        player.muscle += 5;
        player.hp -= 5;
    }

    void inclineBenchPress() {
        player.muscle += 4;
        player.hp -= 4;
    }

    void chestPress() {
        player.muscle += 3;
        player.hp -= 3;
    }

    void dips() {
        player.muscle += 2;
        player.hp -= 2;
    }

    void fly() {
        player.muscle += 1;
        player.hp -= 1;
    }*/
}

