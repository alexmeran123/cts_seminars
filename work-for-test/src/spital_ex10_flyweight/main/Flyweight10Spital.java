package spital_ex10_flyweight.main;

import spital_ex10_flyweight.model.BazaDeDatePacienti;
import spital_ex10_flyweight.model.Internare;

public class Flyweight10Spital {
    public static void main(String[] args) {
        BazaDeDatePacienti bp = new BazaDeDatePacienti();
        bp.getPacient("Alina", "07223", "nu stiu").interneaza(new Internare("21A", 3, 4));


        bp.getPacient("Alex", "072234", "Berceni").interneaza(new Internare("22B", 3, 4));
       bp.getPacient("", "07223", "plm").interneaza(new Internare("23C", 3, 4));

    }
}
