package spital_ex10_flyweight.model;

public class Internare {

    private String numarSalon;
    private int nrPat;
    private int nrZileSpitalizare;

    public Internare(String numarSalon, int nrPat, int nrZileSpitalizare) {
        this.numarSalon = numarSalon;
        this.nrPat = nrPat;
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    public String getNumarSalon() {
        return numarSalon;
    }

    public int getNrPat() {
        return nrPat;
    }

    public int getNrZileSpitalizare() {
        return nrZileSpitalizare;
    }
}
