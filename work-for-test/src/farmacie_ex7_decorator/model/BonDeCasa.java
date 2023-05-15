package farmacie_ex7_decorator.model;

public class BonDeCasa implements IBonFiscal{

    @Override
    public void printeaza() {
        System.out.println("A fost printat bonul fiscal");
    }
}
