import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class BilletIForsalg implements Billet {
    private String id;
    private static int PRIS = 120;
    private static final int RABAT_PROCENT = 15;

    public BilletIForsalg(String id, int dageTilEvent) {
        this.id = id;
        if (dageTilEvent < 10) {
            PRIS -= (PRIS * RABAT_PROCENT / 100);
        }
    }

    @Override
    public int getPris() {
        return PRIS;
    }

    @Override
    public String toString() {
        return "Billet i forsalg - ID: " + id + ", Pris: " + PRIS + " kr.";
    }
}