package spital_ex15_command.model;

public class Medic {

    String nume;


    public Medic(String nume) {
        this.nume = nume;
    }

    public void executaComanda(int nrCoada) {
        System.out.println(String.format("Doctorul %s : Am trimis pacient la coada %d", nume, nrCoada));
    }
}
