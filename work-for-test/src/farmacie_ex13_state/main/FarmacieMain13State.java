package farmacie_ex13_state.main;

import farmacie_ex13_state.model.Reteta;

public class FarmacieMain13State {
    public static void main(String[] args) {
        Reteta reteta = new Reteta("34532");
        reteta.setStareAchizitionata();
        reteta.setStareEmisa();
        reteta.setStareAchizitionata();
        reteta.setStareSolicitata();
    }
}
