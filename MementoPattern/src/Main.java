import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Marine m = new Marine();

        m.upgradeArmor();
        m.upgradeWeapon();
        m.upgradeWeapon();
        m.showStatus(); // W : 3 , A : 2

        m.revertUpgrade();
        m.showStatus(); // W : 2 , A : 2

        m.revertUpgrade();
        m.showStatus(); // W : 1 , A : 2

    }
}
