package spital_ex9_proxy.model;

public class Pacient {

    private String numePacient;

    private boolean areAsigurare;

    public Pacient(String numePacient, boolean areAsigurare) {
        this.numePacient = numePacient;
        this.areAsigurare = areAsigurare;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }
}
