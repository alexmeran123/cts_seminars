package spital_ex_6_facade.main;

import spital_ex_6_facade.model.Doctor;
import spital_ex_6_facade.model.Facade;
import spital_ex_6_facade.model.Pacient;
import spital_ex_6_facade.model.Salon;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex6FacadeMain {
    public static void main(String[] args) {
        Pacient p = new Pacient("Teo", "GRAVA");
        Doctor d = new Doctor();

        List<Boolean> paturi = Arrays.asList(false,false,true);
        Salon s = new Salon(paturi);

        Facade f = new Facade();

        f.verificaInternare(p,d,s);
        Pacient p1 = new Pacient("Fane", "GRAVA");
        f.verificaInternare(p1,d,s);
    }
}
