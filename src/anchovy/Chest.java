package anchovy;

public class Chest {
    Player player;
    public Chest(Player player) {
        this.player = player;
    }

    public void benchPress() {
        player.muscle += 5;
        player.hp -= 5;
        System.out.println("HP가 5 닳았습니다!!");
        System.out.println("근육량이 5 늘었습니다!!");
    }

    public void inclineBenchPress() {
        player.muscle += 4;
        player.hp -= 4;
        System.out.println("HP가 4 닳았습니다!!");
        System.out.println("근육량이 4 늘었습니다!!");
    }

    public void chestPress() {
        player.muscle += 3;
        player.hp -= 3;
        System.out.println("HP가 3 닳았습니다!!");
        System.out.println("근육량이 3 늘었습니다!!");
    }

    public void dips() {
        player.muscle += 2;
        player.hp -= 2;
        System.out.println("HP가 2 닳았습니다!!");
        System.out.println("근육량이 2 늘었습니다!!");
    }

    public void fly() {
        player.muscle += 1;
        player.hp -= 1;
        System.out.println("HP가 1 닳았습니다!!");
        System.out.println("근육량이 1 늘었습니다!!");
    }
}
