package farmacie_ex15_command.model;

public class Comanda implements IComanda {
    private String nrReteta;
    private AjutorFarmacist ajutorFarmacist;

    public Comanda(String nrReteta, AjutorFarmacist ajutorFarmacist) {
        this.nrReteta = nrReteta;
        this.ajutorFarmacist = ajutorFarmacist;
    }

    @Override
    public void executa() {
        System.out.println("A fost adusa reteta cu nr " + nrReteta  + " de catre" + ajutorFarmacist.getNume());
    }

}
