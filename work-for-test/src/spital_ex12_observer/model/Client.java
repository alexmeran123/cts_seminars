package spital_ex12_observer.model;

public class Client implements IClient {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare() {
        System.out.println(String.format("%s ai primit o notificare", nume));
    }

    @Override
    public String getNume() {
        return this.nume;
    }
}
