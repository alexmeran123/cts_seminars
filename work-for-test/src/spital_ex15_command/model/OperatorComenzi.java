package spital_ex15_command.model;

import java.util.ArrayList;
import java.util.List;

public class OperatorComenzi {
    List<ICommand> comenzi;

    public OperatorComenzi() {
        this.comenzi = new ArrayList<>();
    }

    public void executaComenzi(){
        if(comenzi.size() != 0){
            comenzi.get(0).execute();
            comenzi.remove(comenzi.get(0));
        }
    }
    public void invocaComanda(ICommand c){
        this.comenzi.add(c);
    }
}
