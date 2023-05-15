package farmacie_ex11_strategy.model;

public class PlataCard implements IPlata{
    @Override
    public void plateste(int suma, String nume) {
        System.out.println("A fost platita cu cardul suma " + suma + " de catre " + nume);
    }
}
