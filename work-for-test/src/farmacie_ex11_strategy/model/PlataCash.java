package farmacie_ex11_strategy.model;

import farmacie_ex10_flyweight.model.IClient;

public class PlataCash implements IPlata {
    @Override
    public void plateste(int suma, String nume) {
        System.out.println("A fost platita cash suma " + suma + " de catre " + nume);
    }
}
