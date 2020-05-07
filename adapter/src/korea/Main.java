package korea;

import china.Zealot;
import japan.Marine;

public class Main {
    public static void main(String[] args) {
       Marine marine = new Marine();
       Zealot zealot = new Zealot();

        makeItFast(new AdapterJapan(marine));
        makeItFast(new AdapterChina(zealot));

        System.out.println(marine.getSpeed());
        System.out.println(zealot.getSpeed());
    }

    public static void makeItFast(Acceleratable acceleratable) {
        acceleratable.accelerate();
    }

}
