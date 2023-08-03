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
            System.out.println(player.name+"님의 HP:"+player.hp);
            System.out.println(player.name+"님의 근육량:"+player.muscle);
            System.out.println("1.가슴 2.등 3.하체 4.어깨 5.팔 6.그만하기");
            int part = sc.nextInt();
            int j = player.equip[4];
            if (part == 1) {
                Chest chest = new Chest(player);
                Chestor chestor = new Chestor(player);
                ChestorWithBelt benchPress = new ChestorWithBelt(player);
                int i = player.equip[1];
                System.out.println("1.벤치프레스 2.인클라인벤치프레스 3.체스트프레스 4.딥스 5.플라이");
                int kind = sc.nextInt();
                if (i==0){
                    if (kind == 1) {
                        chest.benchPress();
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
                } else if (i == 1){
                    if (kind == 1) {
                        if (j==1){
                            benchPress.benchPress();
                        } else {
                            chestor.benchPress();
                        }
                    } else if (kind == 2) {
                        chestor.inclineBenchPress();
                    } else if (kind == 3) {
                        chestor.chestPress();
                    } else if (kind == 4) {
                        chestor.dips();
                    } else if (kind == 5) {
                        chestor.fly();
                    } else {
                        System.out.println("올바른 번호를 입력하시오.");
                    }
                } else {
                    System.out.println("장비 장착 오류");
                }
            } else if (part == 2) {
                Back back = new Back(player);
                Backor backor = new Backor(player);
                BackorWithBelt deadLift = new BackorWithBelt(player);
                int i = player.equip[0];
                System.out.println("1.풀업 2.데드리프트 3.랫풀다운 4.덤벨로우 5.시티드로우");
                int kind = sc.nextInt();
                if (i==0){
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
                } else if (i==1){
                    if (kind == 1) {
                        backor.pullUp();
                    } else if (kind == 2) {
                        if (j==1){
                            deadLift.deadLift();
                        } else {
                            backor.deadLift();
                        }
                    } else if (kind == 3) {
                        backor.latPulldown();
                    } else if (kind == 4) {
                        backor.dumbbellLow();
                    } else if (kind == 5) {
                        backor.seatedRow();
                    } else {
                        System.out.println("올바른 번호를 입력하시오.");
                    }
                } else {
                    System.out.println("장비 장착 오류");
                }
            } else if (part == 3) {
                Leg leg = new Leg(player);
                Legor legor = new Legor(player);
                LegorWithBelt squat = new LegorWithBelt(player);
                int i = player.equip[2];
                System.out.println("1.스쿼트 2.레그프레스 3.레그익스텐션 4.레그컬 5.힙어브덕션");
                int kind = sc.nextInt();
                if (i==0){
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
                } else if (i==1){
                    if (kind == 1) {
                        if (j==1){
                            squat.squat();
                        } else {
                            legor.squat();
                        }
                    } else if (kind == 2) {
                        legor.legPress();
                    } else if (kind == 3) {
                        legor.legExtension();
                    } else if (kind == 4) {
                        legor.legCurl();
                    } else if (kind == 5) {
                        legor.hipAbduction();
                    } else {
                        System.out.println("올바른 번호를 입력하시오.");
                    }
                } else {
                    System.out.println("장비 장착 오류");
                }
            } else if (part == 4) {
                Shoulder shoulder = new Shoulder(player);
                Shoulderor shoulderor = new Shoulderor(player);
                int i = player.equip[3];
                System.out.println("1.오버헤드프레스 2.숄더프레스 3.리버스팩덱 4.사이드레터럴레이즈 5.벤트오버레터럴레이즈");
                int kind = sc.nextInt();
                if (i==0){
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
                } else if (i==1){
                    if (kind == 1) {
                        shoulderor.overHeadPress();
                    } else if (kind == 2) {
                        shoulderor.shoulderPress();
                    } else if (kind == 3) {
                        shoulderor.riversePecDeck();
                    } else if (kind == 4) {
                        shoulderor.sideLateralRaise();
                    } else if (kind == 5) {
                        shoulderor.bentOverLateralRaise();
                    } else {
                        System.out.println("올바른 번호를 입력하시오.");
                    }
                } else {
                    System.out.println("장비 장착 오류");
                }
            } else if (part == 5) {
                Arm arm = new Arm(player);
                Armor armor = new Armor(player);
                int i = player.equip[0];
                System.out.println("1.라잉트라이셉스익스텐션 2.케이블프레스다운 3.덤벨컬 4.해머컬");
                int kind = sc.nextInt();
                if (i==0){
                    if (kind == 1) {
                        arm.lyingTricepsExtension();
                    } else if (kind == 2) {
                        arm.cablePressDown();
                    } else if (kind == 3) {
                        arm.dumbbellCurl();
                    } else if (kind == 4) {
                        arm.hammerCurl();
                    } else {
                        System.out.println("올바른 번호를 입력하시오.");
                    }
                } else if(i==1){
                    if (kind == 1) {
                        armor.lyingTricepsExtension();
                    } else if (kind == 2) {
                        armor.cablePressDown();
                    } else if (kind == 3) {
                        armor.dumbbellCurl();
                    } else if (kind == 4) {
                        armor.hammerCurl();
                    } else {
                        System.out.println("올바른 번호를 입력하시오.");
                    }
                } else {
                    System.out.println("장비 장착 오류");
                }
            } else if (part == 6) {
                break;
            } else {
                System.out.println("올바른 번호를 입력하시오.");
            }
        }
        return player;
    }
}