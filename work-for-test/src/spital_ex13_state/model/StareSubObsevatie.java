package spital_ex13_state.model;

public class StareSubObsevatie implements IStare {
    @Override
    public void actiune(Pacient p) {
        System.out.println("Pacientul este sub observatie pentru ca e in stare grava");
        p.setState(this);
    }
}
