package farmacie_ex7_decorator.main;

import farmacie_ex7_decorator.model.BonDeCasa;
import farmacie_ex7_decorator.model.Decorator;
import farmacie_ex7_decorator.model.IBonFiscal;

public class MainDecoratorFarmacie {
    public static void main(String[] args) {
        IBonFiscal bon = new BonDeCasa();

        IBonFiscal bonDecorat = new Decorator(bon);
        bonDecorat.printeaza();
    }
}
