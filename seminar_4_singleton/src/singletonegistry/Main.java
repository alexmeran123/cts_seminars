package singletonegistry;

import singletonegistry.model.Firma;

public class Main {
  public static void main(String[] args) {
    //
    Firma firma = Firma.getFirma("SC ceva SRL");
    Firma firma1 = Firma.getFirma("SC altceva SRL");
    Firma firma2 = Firma.getFirma("SC ceva SRL");
    firma.angajare();
    firma1.angajare();
    firma2.angajare();

    System.out.println(firma);
    System.out.println(firma1);
    System.out.println(firma2);
  }
}
