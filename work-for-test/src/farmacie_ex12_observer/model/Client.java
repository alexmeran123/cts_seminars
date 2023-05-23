package farmacie_ex12_observer.model;

public class Client implements IClient {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public void primesteNotificare() {
        System.out.println("Hey "+ nume + " ai primit o notificare");
    }
}
