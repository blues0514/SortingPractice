package korea;

import china.Zealot;
import japan.Marine;

public class AdapterChina extends Zealot implements Acceleratable{
    Zealot zealot;

    public AdapterChina(Zealot zealot) {
        this.zealot = zealot;
    }

    @Override
    public void accelerate() {
        charge();
    }
}
