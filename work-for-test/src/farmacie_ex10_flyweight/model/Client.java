package farmacie_ex10_flyweight.model;

public class Client implements IClient {
    private String nume;
    private String numarAsigurare;

    public Client(String nume, String numarAsigurare) {
        this.nume = nume;
        this.numarAsigurare = numarAsigurare;
    }

    @Override
    public void cumparaReteta(Reteta reteta) {
        System.out.println(String.format("%s cu nr asig %s a cumparat reteta %d , a platit suma %f si numarul de medicante %d",
                nume, numarAsigurare, reteta.getNumarReteta(),
                reteta.getSumaPlata(),
                reteta.getNrMedicamente()));
    }
}
