public class Kerrighan extends Ghost{

    private Kerrighan() {

    }

    private static Kerrighan _instance;

    public static Kerrighan getInstance() {
        if (_instance == null)
            _instance = new Kerrighan();

        return _instance;
    }

    public void print() {
        System.out.println("Kerighan");
    }
}
