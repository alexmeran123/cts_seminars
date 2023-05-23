package spital_ex9_proxy.model;

public class Spital implements ISpital{

    private String nume;

    @Override
    public void interneazaPacient(Pacient p) {
        System.out.println("Pacientul cu numele" + p.getNumePacient() + " a fost internat");
    }
}
