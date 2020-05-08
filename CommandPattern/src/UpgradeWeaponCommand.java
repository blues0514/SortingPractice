public class UpgradeWeaponCommand extends Command {
    public UpgradeWeaponCommand(Marine marine) {
        super(marine);
    }

    @Override
    public void execute() {
        getMarine().setWeapon(getMarine().getWeapon() + 1);
        System.out.println("공업 " + getMarine().getWeapon());
    }
}
