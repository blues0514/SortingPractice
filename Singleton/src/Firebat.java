public class Firebat {
    private Firebat() {

    }

    private static Firebat _instance;

    public static Firebat getInstance() {
        if (_instance == null)
            _instance = new Firebat();

        return _instance;
    }
}
