package farmacie_ex12_observer.model;

import java.util.ArrayList;
import java.util.List;

public class Farmacie implements IFarmacie {

    private String numeFarmacie;

    private List<IClient> clientList;

    public Farmacie(String numeFarmacie) {
        this.numeFarmacie = numeFarmacie;
        this.clientList = new ArrayList<>();
    }

    public void notificarePretMedicament(){
      notificareClienti("Paracetamolu s a facut 12 lei");
    }

    public void notificarePretMedicamentPaduden(){
        notificareClienti("Padudenul s a facut 20 lei");
    }

    @Override
    public void aboneazaClient(Client c) {
        clientList.add(c);
    }

    @Override
    public void dezabonareClient(Client c) {
        clientList.remove(c);
    }

    @Override
    public void notificareClienti(String mesaj) {
        for(IClient c : clientList){
            System.out.println(String.format("Salut %s ai primit urmatoarea notificare %s: ", c.getNume(), mesaj));
        }
    }
}
