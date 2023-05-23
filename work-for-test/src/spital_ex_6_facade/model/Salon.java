package spital_ex_6_facade.model;

import java.util.List;

public class Salon {
    private List<Boolean> paturiLibere;

    public Salon(List<Boolean> paturiLibere) {
        this.paturiLibere = paturiLibere;
    }

    Boolean verificaPatLiber(){
        for(int i = 0 ; i < paturiLibere.size(); i++){
            if(paturiLibere.get(i) == true){
                System.out.println("Patul cu numarul " + i  + " este liber");
                paturiLibere.set(i, false);
                return true;
            }
        }
        System.out.println("Nu este niciun pat liber din pacate");
        return false;
    }
}
