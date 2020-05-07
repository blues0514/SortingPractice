package japan;

public class Marine{
    private int speed;

    public Marine() {
        speed = 5;
    }

    public int getSpeed() {
        return speed;
    }

    public void useSteamPack() {
        speed += 1;
    }

}
