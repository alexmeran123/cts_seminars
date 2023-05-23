package farmacie_ex15_command.main;

import farmacie_ex12_observer.model.Farmacie;
import farmacie_ex15_command.model.AjutorFarmacist;
import farmacie_ex15_command.model.Comanda;
import farmacie_ex15_command.model.Farmacist;
import farmacie_ex15_command.model.IComanda;

public class MainFarmacieEx15 {
    public static void main(String[] args) {
        Farmacist farmacist = new Farmacist();
        AjutorFarmacist af = new AjutorFarmacist("Gigel");
        IComanda c = new Comanda("434", af);

        IComanda c2 = new Comanda("454", af);
        IComanda c3 = new Comanda("4354544", af);
        IComanda c4 = new Comanda("4535678", af);

        farmacist.invocaComanda(c2);
        farmacist.invocaComanda(c3);
        farmacist.invocaComanda(c4);

        farmacist.invocaComanda(c);

        farmacist.executaComanda();
        farmacist.executaComanda();farmacist.executaComanda();farmacist.executaComanda();
        farmacist.executaComanda();





    }
}
