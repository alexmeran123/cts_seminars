package farmacie_ex11_strategy.model;

public class Client {
    private String nume;
    private IPlata plata;

    public Client(String nume) {
        this.nume = nume;
        this.plata = new PlataCard();
    }

    public void plateste(int suma){
        plata.plateste(suma, nume);
    }

    public void setPlata(IPlata plata) {
        this.plata = plata;
    }
}
