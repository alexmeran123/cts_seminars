package restaurant_ex5_cadapter.main;

import restaurant_ex5_cadapter.model.existent.ISoft;
import restaurant_ex5_cadapter.model.existent.SoftRestaurant;
import restaurant_ex5_cadapter.model.nou.SoftAdapter;
import restaurant_ex5_cadapter.model.nou.SoftBar;

public class Main {
    public static void apeleaza(ISoft soft){
        soft.printeazaFactura();
    }
    public static void main(String[] args) {
        ISoft softR = new SoftRestaurant();
//        softR.printeazaFactura();
        apeleaza(softR);
//        ISoft soft = new SoftAdapter();
//        soft.printeazaFactura();
        ISoft soft = new SoftAdapter();
        apeleaza(soft);
    }
}
