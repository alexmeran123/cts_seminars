package spital_ex12_observer.model;

public interface ISpital {
    public void abonareClient(IClient c);

    public void dezabonareClient(IClient c);

    public void notificareClienti(String nume);
}
