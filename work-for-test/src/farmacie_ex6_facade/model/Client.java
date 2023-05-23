package farmacie_ex6_facade.model;

public class Client {

    private boolean cardSanatateValabil;
    private String medicament;

    private int stocVrut;

    public Client(boolean cardSanatateValabil, String medicament, int stocVrut) {
        this.cardSanatateValabil = cardSanatateValabil;
        this.medicament = medicament;
        this.stocVrut = stocVrut;
    }

    public boolean isCardSanatateValabil() {
        return cardSanatateValabil;
    }

    public String getMedicament() {
        return medicament;
    }

    public int getStocVrut() {
        return stocVrut;
    }

}
