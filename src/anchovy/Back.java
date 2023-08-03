package anchovy;

public class Back{
    Player player;
    public Back(Player player) {
        this.player = player;
    }
    public void pullUp(){
        player.muscle+=5;
        player.hp-=5;
        System.out.println("HP가 5 닳았습니다!!");
        System.out.println("근육량이 5 늘었습니다!!");
    }
    public void deadLift(){
        player.muscle+=4;
        player.hp-=4;
        System.out.println("HP가 4 닳았습니다!!");
        System.out.println("근육량이 4 늘었습니다!!");
    }
    public void latPulldown(){
        player.muscle+=3;
        player.hp-=3;
        System.out.println("HP가 3 닳았습니다!!");
        System.out.println("근육량이 3 늘었습니다!!");
    }
    public void dumbbellLow(){
        player.muscle+=2;
        player.hp-=2;
        System.out.println("HP가 2 닳았습니다!!");
        System.out.println("근육량이 2 늘었습니다!!");
    }
    public void seatedRow(){
        player.muscle+=1;
        player.hp-=1;
        System.out.println("HP가 1 닳았습니다!!");
        System.out.println("근육량이 1 늘었습니다!!");
    }
}