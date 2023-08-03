package anchovy;

public class Legor extends Leg{

    public Legor(Player player) {
        super(player);
    }
    @Override
    public void squat(){
        player.muscle+=10;
        player.hp-=5;
        System.out.println("HP가 5 닳았습니다!!");
        System.out.println("근육량이 10 늘었습니다!!");
    }
    public void legPress(){
        player.muscle+=8;
        player.hp-=4;
        System.out.println("HP가 4 닳았습니다!!");
        System.out.println("근육량이 8 늘었습니다!!");
    }
    public void legExtension(){
        player.muscle+=6;
        player.hp-=3;
        System.out.println("HP가 3 닳았습니다!!");
        System.out.println("근육량이 6 늘었습니다!!");
    }
    public void legCurl(){
        player.muscle+=4;
        player.hp-=2;
        System.out.println("HP가 2 닳았습니다!!");
        System.out.println("근육량이 4 늘었습니다!!");
    }
    public void hipAbduction(){
        player.muscle+=2;
        player.hp-=1;
        System.out.println("HP가 1 닳았습니다!!");
        System.out.println("근육량이 2 늘었습니다!!");
    }

}
