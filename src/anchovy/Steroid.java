package anchovy;

public class Steroid extends Thread {
    Player player;
    int key = 0;

    public Steroid(Player player) {
        this.player = player;
    }

    @Override
    public void run() {
        System.out.println("Roider thread started. \nWait for a few minutes!!");
        try {
            Thread.sleep(5 * 60 * 1000);
            player.key = 1;
            System.out.println("Steroid Unlocked");
        } catch (InterruptedException e) {
            System.out.println("Level up thread interrupted.");
        }

    }
}
