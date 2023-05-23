package spital_ex13_state.model;

public class StareInternat implements IStare{
    @Override
    public void actiune(Pacient p) {
        System.out.println("Pacientul a intrat in spital(internat)");
        p.setState(this);
    }
}
