package anchovy;

public class Steroid extends Thread {
    Player player;
    int key = 0;

    public Steroid(Player player) {
        this.player = player;
    }

    @Override
    public void run() {
        System.out.println("Roider thread started. \n Wait for a few minutes!!");
        while (true) {
            try {
                Thread.sleep(5 * 60 * 1000);
                player.key = 1;
            } catch (InterruptedException e) {
                System.out.println("Level up thread interrupted.");
                break;
            }
        }

    }
}
