package farmacie_ex13_state.model;

public class Reteta {
    private String nrReteta;
    private IState state;

    public Reteta(String nrReteta) {
        this.nrReteta = nrReteta;
        state = new StareEmisa();
    }

     void setState(IState state) {
        this.state = state;
    }

    public String getNrReteta() {
        return nrReteta;
    }

    public void setStareAchizitionata(){
        IState stare = new StareAchizitionata();
        stare.changeState(this);
    }

    public void setStareEmisa(){
        IState stare = new StareEmisa();
        stare.changeState(this);
    }
    public void setStareSolicitata(){
        IState stare = new StareSolicitata();
        stare.changeState(this);
    }

     IState getState() {
        return state;
    }
}
