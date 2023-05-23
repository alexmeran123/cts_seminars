package spital_ex12_observer.main;

import spital_ex12_observer.model.Client;
import spital_ex12_observer.model.Spital;

public class Main {
    public static void main(String[] args) {

        Spital spital = new Spital("Regina Maria");

        Client  maricica = new Client("Maricica");
        Client  gigel = new Client("Gigel");
        Client  Sabaton = new Client("Sabaton Gorila");

        spital.abonareClient(maricica);
        spital.abonareClient(gigel);

        spital.notificareClienti("Corbeanca Virus");
        System.out.println("=========================");
        spital.abonareClient(Sabaton);

        spital.notificareClienti("covid23");

        spital.dezabonareClient(maricica);

        System.out.println("==============================");


        spital.notificareClienti("boala lu calache");



    }
}
