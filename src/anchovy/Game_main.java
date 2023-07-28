package anchovy;
import java.util.Scanner;

public class Game_main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("┌─────────────────┐");
            System.out.println("│  1. GAME START  │");
            System.out.println("│  2. Exit        │");
            System.out.println("└─────────────────┘");
            int num = sc.nextInt();
            if(num == 1){
                break;
            }
            else if(num == 2){
                System.out.println("GAME OVER");
                System.exit(0);
            }
            else{
                System.out.println("올바른 번호를 입력하세요.");
            }
        }

        // 플레이어
        System.out.println("=======================");
        System.out.println("멸치의 이름을 지정하세요.");
        String name = sc.next();
        System.out.println(name+"님 환영합니다.");
        System.out.println("게임을 시작합니다!\n");
        Player player = new Player(name, 100 , 15, 0);
        Training training = new Training(player);
        Food food = new Food(player);

        //메인 메뉴
        while(true){
            System.out.println("┌───────────────────────────┐");
            System.out.println("│         멸치 키우기         │");
            System.out.println("└───────────────────────────┘");
            System.out.println("\n==========메인메뉴==========");
            System.out.println("1.운동하기\n2.식사하기\n3.인벤토리\n4.휴식\n5.내 정보\n6.게임종료");
            System.out.println("=============================\n");
            int menu = sc.nextInt();

            if(menu == 1){
                if (player.hp == 100) {
                    player = training.mainMenu();
                    System.out.println("체력부족!! \n식사와 휴식으로 체력을 회복하시오.");
                } else {
                    System.out.println("체력부족!! \n식사와 휴식으로 체력을 회복하시오.");
                }
            }
            else if(menu == 2){
                if (player.hp<100){
                    player = food.eating();
                } else {
                    System.out.println("체력 만땅!! 운동가자~");
                }
            }
            else if(menu == 3){

            }
            else if(menu == 4){

            }
            else if(menu == 5){
                System.out.println("Hp:" + player.hp +"\nMuscle:" + player.muscle + "\nProtein:" + player.protein);
            }
            else if(menu == 6){
                System.out.println("게임 종료");
                System.exit(0);
            }
            else{
                System.out.println("올바른 번호를 입력하시오.");
            }
        }
    }

}

