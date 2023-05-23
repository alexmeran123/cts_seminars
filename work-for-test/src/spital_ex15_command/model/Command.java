package spital_ex15_command.model;

public class Command implements ICommand {
    private int nrCoada;

    private Medic medic;

    public Command(int nrCoada, Medic medic) {
        this.nrCoada = nrCoada;
        this.medic = medic;
    }

    @Override
    public void execute() {
        medic.executaComanda(nrCoada);
    }
}
