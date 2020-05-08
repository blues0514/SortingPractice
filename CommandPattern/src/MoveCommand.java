public class MoveCommand extends Command {
    private int x;
    private int y;

    public MoveCommand(Marine marine, int x, int y) {
        super(marine);
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        getMarine().setX(x);
        getMarine().setY(y);
        System.out.printf("%d, %d로 이동\n", x, y);
    }
}
