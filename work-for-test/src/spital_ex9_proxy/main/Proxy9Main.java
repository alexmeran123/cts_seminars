package spital_ex9_proxy.main;

import spital_ex9_proxy.model.Pacient;
import spital_ex9_proxy.model.ProxySpital;
import spital_ex9_proxy.model.Spital;


public class Proxy9Main {
    public static void main(String[] args) {
        Pacient p = new Pacient("Corpaci Cornel", false);
        Pacient p1 = new Pacient("Leo", true);
        Pacient p2 = new Pacient("Fanel Bonbolnel", true);

        Spital spital = new Spital();

        spital.interneazaPacient(p);

        ProxySpital proxy = new ProxySpital(spital);


        proxy.interneazaPacient(p);
        proxy.interneazaPacient(p1);
        proxy.interneazaPacient(p2);
    }
}
