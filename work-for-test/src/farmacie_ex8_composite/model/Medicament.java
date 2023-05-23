package farmacie_ex8_composite.model;

public class Medicament implements ComponentaAbstracta{

   private  String numeMedicament;

    public Medicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    @Override
    public void showInfo(String identare) {
        System.out.println(identare + " " + numeMedicament);
    }

    @Override
    public void adaugaNod(ComponentaAbstracta c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(ComponentaAbstracta c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void getNodCopil(int index) {
        throw new UnsupportedOperationException();
    }
}
