import java.util.Stack;

public class Marine {
    private int armor = 1;
    private int weapon = 1;

    private Stack<UpgradeInfo> shots = new Stack<>();


    public void upgradeArmor() {
        shots.push(new UpgradeInfo(weapon, armor));
        ++armor;
    }

    public void upgradeWeapon() {
        shots.push(new UpgradeInfo(weapon, armor));
        ++weapon;
    }

    public void revertUpgrade() {
        UpgradeInfo shot = shots.pop();

        weapon = shot.getWeapon();
        armor = shot.getArmor();
    }


    public void showStatus() {
        System.out.printf("W : %d , A : %d\n", weapon, armor);
    }

}
