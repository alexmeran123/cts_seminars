package spital_ex9_proxy.model;

public class ProxySpital implements ISpital{

    private ISpital spital;

    public ProxySpital(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void interneazaPacient(Pacient p) {
        if(p.isAreAsigurare() == false){
            System.out.println("Pacientul cu numele" + p.getNumePacient() + " nu poate fi internat ca n are asigurare");
        }
        else {
            System.out.println("Pacientul cu numele" + p.getNumePacient() + " a fost internat");
        }
    }
}
