package spital_ex11_strategy.model;

public class Pacient {
    private String nume;

    private IPlata plata;

    public Pacient(String nume) {
        this.nume = nume;
        plata = new PlataCash();
    }

    public void setPlata(IPlata plata) {
        this.plata = plata;
    }

    public void plateste(int suma){
        this.plata.plateste(suma);
    }
}
