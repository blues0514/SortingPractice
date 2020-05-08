public class Main {
    public static void main(String[] args) {
        Marine marine = new Marine();

        // TDD(Test-Driven Development)
        // 공업(예약)
        CommanderManager.getInstance().add(new UpgradeWeaponCommand());
        // 50, 100으로 이동(예약)
        CommanderManager.getInstance().add(new MoveCommand(50,100));
        // 방업(예약)
        CommanderManager.getInstance().add(new UpgradeArmorCommand());
        // 마지막 명령 취소
        CommanderManager.getInstance().cancelLast();
        // 실제로 실행
        CommanderManager.getInstance().executeAll();
    }
}
