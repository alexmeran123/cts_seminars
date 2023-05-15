package farmacie_ex12_observer.main;

import farmacie_ex12_observer.model.Client;
import farmacie_ex12_observer.model.Farmacie;
import spital_ex9_proxy.model.Spital;

public class MainFarmacie12 {
    public static void main(String[] args) {
        Client c = new Client("Gigel");

        Client c2 = new Client("Agurita");

        Client c3 = new Client("Morena");

        Farmacie farmacie = new Farmacie("Catena");
        farmacie.aboneazaClient(c);
        farmacie.aboneazaClient(c2);

        farmacie.notificarePretMedicament();
        farmacie.dezabonareClient(c2);
        farmacie.notificarePretMedicamentPaduden();



    }
}
