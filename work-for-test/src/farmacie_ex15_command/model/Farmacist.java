package farmacie_ex15_command.model;

import java.util.ArrayList;
import java.util.List;

public class Farmacist {
    private List<IComanda> comenzi;

    public Farmacist() {
        comenzi = new ArrayList<>();
    }

    public void invocaComanda(IComanda c){
        comenzi.add(c);
    }

    public void executaComanda(){
      if(comenzi.size() > 0){
          comenzi.get(0).executa();
          comenzi.remove( comenzi.get(0));
      }
      else {
          System.out.println("Nu s a putut");
      }
    }
}
