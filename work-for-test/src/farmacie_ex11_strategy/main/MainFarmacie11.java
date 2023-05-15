package farmacie_ex11_strategy.main;

import farmacie_ex11_strategy.model.Client;
import farmacie_ex11_strategy.model.PlataCash;

public class MainFarmacie11 {
    public static void main(String[] args) {
        Client c = new Client("Gica");
        c.plateste(23);
        c.setPlata(new PlataCash());
        c.plateste(544644);
    }
}
