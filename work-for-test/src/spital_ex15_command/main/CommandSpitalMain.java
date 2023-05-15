package spital_ex15_command.main;

import spital_ex15_command.model.Command;
import spital_ex15_command.model.ICommand;
import spital_ex15_command.model.Medic;
import spital_ex15_command.model.OperatorComenzi;

public class CommandSpitalMain {
    public static void main(String[] args) {
        Medic medic = new Medic("Iorga Andrei Maselaru");

        ICommand c1 = new Command(1, medic);
        ICommand c2 = new Command(2, medic);
        ICommand c3 = new Command(3, medic);

        OperatorComenzi operatorComenzi = new OperatorComenzi();
        operatorComenzi.invocaComanda(c1);
        operatorComenzi.invocaComanda(c2);
        operatorComenzi.invocaComanda(c3);

        operatorComenzi.executaComenzi();
        operatorComenzi.executaComenzi();
        operatorComenzi.executaComenzi();


    }
}
