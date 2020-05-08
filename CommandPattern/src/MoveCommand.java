public class MoveCommand extends Command{
    private int x;
    private int y;
    public MoveCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        System.out.printf("%d, %d로 이동\n", x, y);
    }
}
