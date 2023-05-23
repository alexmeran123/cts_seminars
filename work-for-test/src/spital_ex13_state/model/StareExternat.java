package spital_ex13_state.model;

public class StareExternat implements IStare{
    @Override
    public void actiune(Pacient p) {

        if(p.getStare() instanceof StareInternat){
            System.out.println("Pacientul a iesit din spital");
            p.setState(this);
        }
        else {
            System.out.println("Pacientul este in stare grava si nu poate iesi din spital");
        }
    }
}
