package korea;

import japan.Marine;

public class AdapterJapan extends Marine implements Acceleratable {
    Marine marine;

    public AdapterJapan(Marine marine) {
        this.marine = marine;
    }

    @Override
    public void accelerate() {
        useSteamPack();
    }
}
