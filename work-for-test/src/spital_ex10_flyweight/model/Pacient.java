package spital_ex10_flyweight.model;

public class Pacient implements IPacient {

    private String nume;

    private String telefon;

    private String adresa;

    Pacient(String nume, String telefon, String adresa) {
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    @Override
    public void interneaza(Internare internare) {
        System.out.println(String.format("Pacientul %s cu nr de tel %s si adresa %s s a internat la %s %d zile %d salon",
                nume, telefon, adresa, internare.getNumarSalon(), internare.getNrPat(), internare.getNrZileSpitalizare()));
    }
}
