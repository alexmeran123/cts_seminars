package farmacie_ex8_composite.model;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaAbstracta{

    private String numeSectiune;

    private List<ComponentaAbstracta> nodes;

    public Sectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
        nodes= new ArrayList<>();
    }

    @Override
    public void showInfo(String identare) {
        System.out.println(identare + numeSectiune);
        for(ComponentaAbstracta c : nodes){
            c.showInfo("  " + "  ") ;
        }
    }

    @Override
    public void adaugaNod(ComponentaAbstracta c) {
        nodes.add(c);
    }

    @Override
    public void stergeNod(ComponentaAbstracta c) {
        nodes.remove(c);
    }

    @Override
    public void getNodCopil(int index) {
        System.out.println(nodes.get(index));
    }
}
