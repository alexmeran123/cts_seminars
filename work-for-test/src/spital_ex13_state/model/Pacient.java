package spital_ex13_state.model;

public class Pacient {
    private String nume;

    private IStare stare;

    public Pacient(String nume) {
        this.nume = nume;
        this.stare = new StareInternat();
    }

    void setState(IStare stare) {
        this.stare = stare;
    }

    public void setStareInternat() {
        IStare stareNoua = new StareInternat();
        stareNoua.actiune(this);
    }

    public void setStareSubObservatie() {
        IStare stareNoua = new StareSubObsevatie();
        stareNoua.actiune(this);
    }

    public void setStareExternat() {
        IStare stareNoua = new StareExternat();
        stareNoua.actiune(this);
    }

    public IStare getStare() {
        return stare;
    }
}
