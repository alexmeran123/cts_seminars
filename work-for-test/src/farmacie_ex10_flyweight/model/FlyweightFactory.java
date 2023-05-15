package farmacie_ex10_flyweight.model;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String, Client> clienti;

    public FlyweightFactory() {
        clienti = new HashMap<>();
    }

    public Client getClient(String nume, String nrAsgi){
        if(!clienti.containsKey(nrAsgi)){
            clienti.put(nrAsgi, new Client(nume, nrAsgi));
        }
        return clienti.get(nrAsgi);
    }
}
