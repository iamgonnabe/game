package anchovy;

public class Level{
    Player player;
    public Level(Player player) {
        this.player = player;
    }


    int exp = 0;
    int expNeededForLevelUp = 100;

    Player level(){
        getExp(player.muscle);
        return player;
    }

    public void getExp(int amount) {
        exp += amount;
        checkLevelUp();
    }

    public void checkLevelUp() {
        if (exp >= expNeededForLevelUp) {
            exp -= expNeededForLevelUp;
            levelUp();
        }
    }

    public void levelUp() {
        player.level++;
        expNeededForLevelUp *= 1.2; // 레벨업할 때마다 경험치가 1.5배씩 증가하도록 설정
        System.out.println("Level Up!! Lv:"+player.level);
        System.out.println("다음 레벨에 필요한 exp: "+expNeededForLevelUp);
        checkLevelUp();
    }
}
