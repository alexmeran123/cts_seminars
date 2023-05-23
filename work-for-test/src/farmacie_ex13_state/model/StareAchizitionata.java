package farmacie_ex13_state.model;

public class StareAchizitionata implements IState
{
    @Override
    public void changeState(Reteta reteta) {
        System.out.println("S a achizitionat reteta cu numarul " + reteta.getNrReteta());
        reteta.setState(this);
    }
}
