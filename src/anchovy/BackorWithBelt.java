package anchovy;

public class BackorWithBelt extends Backor{

    public BackorWithBelt(Player player) {
        super(player);
    }
    @Override
    public void deadLift(){
        player.muscle+=13;
        player.hp-=4;
        System.out.println("HP가 4 닳았습니다!!");
        System.out.println("근육량이 13 늘었습니다!!");
    }
}
