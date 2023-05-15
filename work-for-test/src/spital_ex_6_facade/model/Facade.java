package spital_ex_6_facade.model;

public class Facade {
    public void verificaInternare(Pacient pacient, Doctor doctor, Salon salon) {
        if (doctor.verificaPacient(pacient) == true && salon.verificaPatLiber() == true) {

            System.out.println("Pacientul cu numele " + pacient.getNume() + " a fost internat");

        } else {
            System.out.println("Pacientul cu numele " + pacient.getNume() + " nu a fost internat");
        }
    }
}
