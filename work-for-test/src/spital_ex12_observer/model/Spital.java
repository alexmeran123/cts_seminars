package spital_ex12_observer.model;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital {

    private String nume;

    private List<IClient> clienti;

    public Spital(String nume) {
        this.nume = nume;
        this.clienti = new ArrayList<>();
    }

    @Override
    public void abonareClient(IClient c) {
        this.clienti.add(c);
    }

    @Override
    public void dezabonareClient(IClient c) {
        this.clienti.remove(c);
    }

    @Override
    public void notificareClienti(String virus) {
        for (IClient c : clienti) {
            System.out.println(String.format("Buna ziua %s.Dorim sa va anuntam ca a aparut un nou virus in oras pe nume %s", c.getNume(), virus));
        }
    }
}
