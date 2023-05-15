package farmacie_ex8_composite.model;

public interface ComponentaAbstracta {
    void showInfo(String identare);
    void adaugaNod(ComponentaAbstracta c);
    void stergeNod(ComponentaAbstracta c);
    void getNodCopil(int index);
}
