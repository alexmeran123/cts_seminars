package farmacie_ex6_facade.model;

public class Facade {
    public void eStocValabil(Client client, Farmacist farmacist, Farmacie farmacie) {
        if (farmacist.verificaCardSanatate(client) == true && farmacist.verificaExistentaMedicament(client.getMedicament(), farmacie) == true
                && farmacist.verificaStocMedicament(client.getStocVrut(), farmacie) == true) {
            System.out.println("Avem!Se va face plata");
        } else {
            System.out.println("Imi pare rau dar nu avem");
        }
    }
}
