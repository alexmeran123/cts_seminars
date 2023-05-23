package farmacie_ex6_facade.main;

import farmacie_ex6_facade.model.Client;
import farmacie_ex6_facade.model.Facade;
import farmacie_ex6_facade.model.Farmacie;
import farmacie_ex6_facade.model.Farmacist;

public class Main {

    public static void main(String[] args) {
        Farmacist farmacist = new Farmacist();

        Client c = new Client(true, "Nurofen", 3);

        Farmacie farmacie = new Farmacie("Paracetamol", 4);

        Facade facade = new Facade();
        facade.eStocValabil(c, farmacist,farmacie);
    }
}
