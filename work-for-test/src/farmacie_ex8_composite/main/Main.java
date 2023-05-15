package farmacie_ex8_composite.main;

import farmacie_ex8_composite.model.ComponentaAbstracta;
import farmacie_ex8_composite.model.Medicament;
import farmacie_ex8_composite.model.Sectiune;

public class Main {

    public static void main(String[] args) {
        ComponentaAbstracta c = new Sectiune("Raceala");
        ComponentaAbstracta c1 = new Sectiune("Gripa");
        ComponentaAbstracta c2 = new Medicament("Paracetamol");
        ComponentaAbstracta c3 = new Medicament("Panadol");
        ComponentaAbstracta c4 = new Sectiune("CorbeancaVirus");
        c.adaugaNod(c4);
        ComponentaAbstracta c6 = new Medicament("Virusen");
        ComponentaAbstracta c7 = new Medicament("Boli");
        c4.adaugaNod(c6);
        c4.adaugaNod(c7);
        c1.adaugaNod(c2);
        c1.adaugaNod(c3);
        c.adaugaNod(c1);

        c.showInfo("  ");
    }
}
