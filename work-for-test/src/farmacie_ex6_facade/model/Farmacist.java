package farmacie_ex6_facade.model;

public class Farmacist {

    boolean verificaCardSanatate(Client c){
        if(c.isCardSanatateValabil() == true){
            return true;
        }
        return false;
    }

    boolean verificaExistentaMedicament(String medicament, Farmacie f){
        if(medicament.equals(f.getNrMedicament())){
            return true;
        }
        return false;
    }
    boolean verificaStocMedicament(int stoc, Farmacie f){
        if(stoc <= f.getStocMedicament()){
            return true;
        }
        return false;
    }

}
