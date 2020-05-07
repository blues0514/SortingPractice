package china;

public class Zealot {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public Zealot() {
        speed = 7;
    }

    public void charge() {
        speed += 2;
    }
}
