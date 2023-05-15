package spital_ex10_flyweight.model;

import java.util.HashMap;
import java.util.Map;

public class BazaDeDatePacienti {

    private Map<String, Pacient> pacienti;

    public BazaDeDatePacienti() {
        this.pacienti = new HashMap<>();
    }

    public Pacient getPacient(String nume, String telefon, String adresa) {
            if(!pacienti.containsKey(telefon)){
               Pacient pacient = new Pacient(nume,telefon,adresa);
               pacienti.put(telefon, pacient);
            }
            return pacienti.get(telefon);
    }
}
