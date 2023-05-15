package farmacie_ex9_proxy.model;

public class ModulAchizitionare implements IModul {
    @Override
    public void achizitioneazaMedicament(Client c) {
        System.out.println(String.format("Clientul cu numele %s a achizitionat medicamentul %s", c.getNume(), c.getMedicament()));
    }
}
