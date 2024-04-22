import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Eksempel på brug
public class Main {
    public static void main(String[] args) {
        SolgteBilletter solgteBilletter = new SolgteBilletter();

        BilletIDøren billet1 = new BilletIDøren("001");
        BilletIForsalg billet2 = new BilletIForsalg("002", 5);
        BilletIForsalgStudierabat billet3 = new BilletIForsalgStudierabat("003", "S12345", 8);

        solgteBilletter.tilføjBillet(billet1);
        solgteBilletter.tilføjBillet(billet2);
        solgteBilletter.tilføjBillet(billet3);

        System.out.println(solgteBilletter);
        solgteBilletter.visAntalBilletter();
        System.out.println("Studiekort IDs: " + solgteBilletter.hentAlleStudiekortId());
    }
}
