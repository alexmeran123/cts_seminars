package facade.main;

import facade.model.Bilet;
import facade.model.Client;
import facade.model.Facade;

public class Main {
  public static void main(String[] args) {

    Client client1 = new Client("6031205226704", "Yarina");
    Client client2 = new Client("5010212985473", "Andrei");
    Bilet bilet2 = new Bilet("Yarina");
    Bilet bilet1 = new Bilet("Carmen");
    Facade facade = new Facade();
    facade.permiteIntrarea(client1, bilet2);
    facade.permiteIntrarea(client2, bilet1);
  }
}
