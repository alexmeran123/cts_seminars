package restaurant_ex5_oadapter.model.nou;

import restaurant_ex5_oadapter.model.existent.ISoft;

public class SoftAdapter implements ISoft {
    private SoftBar soft;

    public SoftAdapter(SoftBar soft) {
        this.soft = soft;
    }


    @Override
    public void printeazaFactura() {
        System.out.println("Factura de bar a fost intemeiata");
    }
}
