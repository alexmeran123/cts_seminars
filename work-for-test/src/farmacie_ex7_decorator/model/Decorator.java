package farmacie_ex7_decorator.model;

public class Decorator implements IBonFiscal {

   private IBonFiscal bon;

    public Decorator(IBonFiscal bon) {
        this.bon = bon;
    }

    @Override
    public void printeaza() {
        bon.printeaza();
        System.out.println("La multi ani happy birthday si multa sanatate la ala micu");
    }
}
