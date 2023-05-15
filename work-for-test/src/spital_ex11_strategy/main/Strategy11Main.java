package spital_ex11_strategy.main;

import spital_ex11_strategy.model.Pacient;
import spital_ex11_strategy.model.PlataCardBancar;

public class Strategy11Main {
    public static void main(String[] args) {
        Pacient cornel = new Pacient("Cornel Corpaci");

        cornel.plateste(500);
        cornel.setPlata(new PlataCardBancar());
        cornel.plateste(150);

    }
}
