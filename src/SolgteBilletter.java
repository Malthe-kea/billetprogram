import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class SolgteBilletter {
    private String studiekortId;
    private List<Billet> solgteBilletter;
    private Map<String, Integer> antalBilletter;

    public SolgteBilletter() {
        solgteBilletter = new ArrayList<>();
        antalBilletter = new HashMap<>();
    }

    // Tilføjer solgte billetter
    public void tilføjBillet(Billet billet) {
        solgteBilletter.add(billet);
        String id = billet instanceof BilletIForsalgStudierabat ? ((BilletIForsalgStudierabat) billet)+studiekortId : billet.toString();
        antalBilletter.put(id, antalBilletter.getOrDefault(id, 0) + 1);
    }

    // Udskriver alle solgte billetter
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Collections.sort(solgteBilletter, (b1, b2) -> b1.toString().compareTo(b2.toString()));
        for (Billet billet : solgteBilletter) {
            sb.append(billet.toString()).append("\n");
        }
        return sb.toString();
    }

    // Viser hvor mange af hver slags billetter der er solgt
    public void visAntalBilletter() {
        for (Map.Entry<String, Integer> entry : antalBilletter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Returnerer en String med studiekortnummeret på alle de solgte billetter med studierabat, sorteret med det mindste først
    public String hentAlleStudiekortId() {
        List<String> studiekortIdList = new ArrayList<>();
        for (Billet billet : solgteBilletter) {
            if (billet instanceof BilletIForsalgStudierabat) {
                studiekortIdList.add(((BilletIForsalgStudierabat) billet)+ studiekortId);
            }
        }
        Collections.sort(studiekortIdList);
        return String.join(", ", studiekortIdList);
    }
}