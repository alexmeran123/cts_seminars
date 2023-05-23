package restaurant_ex5_oadapter.main;

import restaurant_ex5_oadapter.model.existent.ISoft;
import restaurant_ex5_oadapter.model.existent.SoftRestaurant;
import restaurant_ex5_oadapter.model.nou.SoftAdapter;
import restaurant_ex5_oadapter.model.nou.SoftBar;

public class Restaurant5Main {

    public static void afCredit(ISoft soft){
        soft.printeazaFactura();
    }
    public static void main(String[] args) {
        ISoft soft = new SoftRestaurant();
//        soft.printeazaFactura();
        SoftBar softBar = new SoftBar();
        ISoft softAdapter = new SoftAdapter(softBar);
        afCredit(soft);
        afCredit(softAdapter);



    }
}
