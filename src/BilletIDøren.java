import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class BilletIDøren implements Billet {
    private String id;
    private static final int PRIS = 150;

    public BilletIDøren(String id) {
        this.id = id;
    }

    @Override
    public int getPris() {
        return PRIS;
    }

    @Override
    public String toString() {
        return "Billet i døren - ID: " + id + ", Pris: " + PRIS + " kr.";
    }
}