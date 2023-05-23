package spital_ex11_strategy.model;

public class PlataCardBancar implements IPlata {
    @Override
    public void plateste(int suma) {
        System.out.println("A fost platita cu card bancar suma " + suma);
    }
}
