
class Player {
    public static final int START = 0, STOP = 1;

    private int state;

    public void setState(int state) {
        this.state = state;
    }

    public void doAction() {
        switch (state) {
            case START:
                System.out.println("Player start");
                break;
            case STOP:
                System.out.println("Player stop");
                break;
        }
    }
}

public class State {

    public static void main(String[] args) {
        Player player = new Player();
        player.setState(Player.START);
        player.doAction();
        player.setState(Player.STOP);
        player.doAction();
    }

}
