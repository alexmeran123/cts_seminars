package spital_ex_6_facade.model;

public class Pacient {
    private String nume;
    private String stare;

    public Pacient(String nume, String stare) {
        this.nume = nume;
        this.stare = stare;
    }

    public String getStare() {
        return stare;
    }

    public String getNume() {
        return nume;
    }

}
