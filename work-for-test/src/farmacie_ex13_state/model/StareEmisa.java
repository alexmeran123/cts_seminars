package farmacie_ex13_state.model;

public class StareEmisa implements IState{
    @Override
    public void changeState(Reteta reteta) {
        System.out.println("S a emis reteta cu numarul " + reteta.getNrReteta());
        reteta.setState(this);
    }
}
