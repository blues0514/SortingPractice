package korea;

import china.Zealot;
import japan.Marine;

public class Main {
    public static void main(String[] args) {
        AdapterJapan marine = new AdapterJapan(new Marine());
        AdapterChina zealot = new AdapterChina(new Zealot());

        makeItFast(marine);
        makeItFast(zealot);

        System.out.println(marine.getSpeed());
        System.out.println(zealot.getSpeed());
    }

    public static void makeItFast(Acceleratable acceleratable) {
        acceleratable.accelerate();
    }

}
