package resturaurant_ex7_decorator.model;

public class DecoratorNotaPlata extends AbstractDecorator{
    public DecoratorNotaPlata(NotaDePlataAbstracta notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaNota() {
        notaDePlata.printeazaNota();
        System.out.println("La multi ani happy birthday");
    }
}
