package farmacie_ex9_proxy.model;

public class Client {
    private String nume;

    private boolean areAsigurare;

    private String medicament;


    public Client(String nume, boolean areAsigurare, String medicament) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;
        this.medicament = medicament;
    }

    public String getNume() {
        return nume;
    }

    public String getMedicament() {
        return medicament;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }
}
