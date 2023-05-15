package spital_ex13_state.main;

import spital_ex13_state.model.Pacient;

public class StateMain {
    public static void main(String[] args) {
        Pacient p = new Pacient("Fanel");
        p.setStareExternat();
       p.setStareInternat();
       p.setStareSubObservatie();
       p.setStareExternat();
    }
}
