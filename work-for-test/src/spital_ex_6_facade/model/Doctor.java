package spital_ex_6_facade.model;

public class Doctor {
    boolean verificaPacient(Pacient p) {
        if (p.getStare().equals("GRAVA")) {
            System.out.println("Pacientul trebuie internat!");
            return true;
        } else {
            System.out.println("Pacientul nu trebuie internat");
            return false;
        }
    }
}
