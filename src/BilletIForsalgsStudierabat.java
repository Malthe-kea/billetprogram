import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class BilletIForsalgStudierabat implements Billet {
    private String id;
    private String studiekortId;
    private static int PRIS = 90;
    private static final int RABAT_PROCENT = 15;

    public BilletIForsalgStudierabat(String id, String studiekortId, int dageTilEvent) {
        this.id = id;
        this.studiekortId = studiekortId;
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
        return "Billet i forsalg med studierabat - ID: " + id + ", Pris: " + PRIS + " kr. Husk dit studiekort!";
    }
}