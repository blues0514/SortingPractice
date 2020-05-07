package korea;

import china.Zealot;


public class AdapterChina implements Acceleratable{
    Zealot zealot;

    public AdapterChina(Zealot zealot) {
        this.zealot = zealot;
    }

    @Override
    public void accelerate() {
        zealot.charge();
    }
}
