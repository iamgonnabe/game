package anchovy;

public class Arm {
    Player player;
    public Arm(Player player) {
        this.player = player;
    }
    public void lyingTricepsExtension(){
        player.muscle+=5;
        player.hp-=5;
        System.out.println("HP가 5 닳았습니다!!");
        System.out.println("근육량이 5 늘었습니다!!");
    }
    public void cablePressDown(){
        player.muscle+=4;
        player.hp-=4;
        System.out.println("HP가 4 닳았습니다!!");
        System.out.println("근육량이 4 늘었습니다!!");
    }
    public void dumbbellCurl(){
        player.muscle+=3;
        player.hp-=3;
        System.out.println("HP가 3 닳았습니다!!");
        System.out.println("근육량이 3 늘었습니다!!");
    }
    public void happerCurl(){
        player.muscle+=2;
        player.hp-=2;
        System.out.println("HP가 2 닳았습니다!!");
        System.out.println("근육량이 2 늘었습니다!!");
    }
}
