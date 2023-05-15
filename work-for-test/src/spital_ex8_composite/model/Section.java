package spital_ex8_composite.model;

public class Section implements AbstractComponent{
    String numeSectie;

    public Section(String numeSectie) {
        this.numeSectie = numeSectie;
    }

    @Override
    public void showInfo(String identation) {
        System.out.println(identation + "Sectia %s"+ numeSectie);
    }

    @Override
    public void addNode(AbstractComponent node) {
       throw new UnsupportedOperationException();
    }

    @Override
    public void deleteNode(AbstractComponent node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void getChildNode(int index) {
        throw new UnsupportedOperationException();
    }
}
