package anchovy;

public class LegorWithBelt extends Legor{

    public LegorWithBelt(Player player) {
        super(player);
    }
    @Override
    public void squat(){
        player.muscle+=15;
        player.hp-=5;
        System.out.println("HP가 5 닳았습니다!!");
        System.out.println("근육량이 15 늘었습니다!!");
    }
}
