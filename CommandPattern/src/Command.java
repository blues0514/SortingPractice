public abstract class Command {
    private Marine marine;

    protected Marine getMarine() {
        return marine;
    }


    public Command(Marine marine) {
        this.marine = marine;
    }

    public abstract void execute();
}
