package farmacie_ex10_flyweight.main;

import farmacie_ex10_flyweight.model.Client;
import farmacie_ex10_flyweight.model.FlyweightFactory;
import farmacie_ex10_flyweight.model.Reteta;

public class MainFlyweightFarmacie {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Client c = factory.getClient("gigel", "1234");

        Client c1 = factory.getClient("Agurita", "321");


        Reteta reteta = new Reteta(323, 150, 4);
        Reteta reteta2 = new Reteta(455, 152, 6);
        Reteta reteta3 = new Reteta(4675, 158, 10);
        c.cumparaReteta(reteta);
        c1.cumparaReteta(reteta2);

        factory.getClient("", "321").cumparaReteta(reteta3);


    }
}
