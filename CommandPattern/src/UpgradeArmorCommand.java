public class UpgradeArmorCommand extends Command{
    public UpgradeArmorCommand(Marine marine) {
        super(marine);
    }

    @Override
    public void execute() {
        getMarine().setArmor(getMarine().getArmor()+1);
        System.out.println("방업 " + getMarine().getArmor());
    }
}
