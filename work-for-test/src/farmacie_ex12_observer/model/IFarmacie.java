package farmacie_ex12_observer.model;

public interface IFarmacie {

    void aboneazaClient(Client c);

    void dezabonareClient(Client c);

    void notificareClienti(String mesaj);
}
