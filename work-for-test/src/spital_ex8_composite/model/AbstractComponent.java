package spital_ex8_composite.model;

public interface AbstractComponent {
     void showInfo(String identation);
     void addNode(AbstractComponent node);
     void deleteNode(AbstractComponent node);
     void getChildNode(int index);

}
