package spital_ex8_composite.main;

import spital_ex8_composite.model.AbstractComponent;
import spital_ex8_composite.model.Department;
import spital_ex8_composite.model.Section;

public class Composite8Main {
    public static void main(String[] args) {
        AbstractComponent dep = new Department("MANAGEMENT");
        AbstractComponent dep1 = new Department("CHIMIE");
        AbstractComponent dep2 = new Department("MARKETING");
        AbstractComponent dep3 = new Department("MEDICINA");
        AbstractComponent dep4 = new Department("CHIRURGIE");
        AbstractComponent sect1 = new Section("droguri puternice");
        AbstractComponent sect2 = new Section("chirurgie");

        dep.addNode(dep1);
        dep.addNode(dep2);
        dep.addNode(dep3);
        dep3.addNode(dep4);
        dep1.addNode(sect1);

        dep.showInfo(" ");
    }
}
