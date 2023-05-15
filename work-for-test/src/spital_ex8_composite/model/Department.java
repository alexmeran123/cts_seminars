package spital_ex8_composite.model;

import java.util.ArrayList;
import java.util.List;

public class Department implements AbstractComponent{
    private List<AbstractComponent> nodes;

    String numeDep;

    public Department(String numeDep) {
        nodes = new ArrayList<>();
        this.numeDep = numeDep;
    }

    @Override
    public void showInfo(String identation) {
        System.out.println(identation + "DEPARTAMENTUL %s contine : " + numeDep);
        for(AbstractComponent a : nodes){
            a.showInfo(identation + "     ");
        }
    }

    @Override
    public void addNode(AbstractComponent node) {
        nodes.add(node);
    }

    @Override
    public void deleteNode(AbstractComponent node) {
        nodes.remove(node);
    }

    @Override
    public void getChildNode(int index) {
        nodes.get(index);
    }
}
