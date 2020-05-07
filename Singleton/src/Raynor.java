public class Raynor {
    private Raynor() {
    }

    private static Raynor _instance;

    public static Raynor getInstance() {
        if (_instance == null)
            _instance = new Raynor();

        return _instance;
    }
}
