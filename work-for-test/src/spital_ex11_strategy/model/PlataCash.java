package spital_ex11_strategy.model;

public class PlataCash implements IPlata {
    @Override
    public void plateste(int suma) {
        System.out.println("A fost platit cash suma" + suma);
    }
}
