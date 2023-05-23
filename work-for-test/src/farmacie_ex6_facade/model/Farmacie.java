package farmacie_ex6_facade.model;

public class Farmacie {
    private String nrMedicament;

   private int stocMedicament;

    public Farmacie(String nrMedicament, int stocMedicament) {
        this.nrMedicament = nrMedicament;
        this.stocMedicament = stocMedicament;
    }

    public String getNrMedicament() {
        return nrMedicament;
    }

    public int getStocMedicament() {
        return stocMedicament;
    }
}
