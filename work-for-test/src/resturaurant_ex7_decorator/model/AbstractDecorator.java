package resturaurant_ex7_decorator.model;

public abstract class AbstractDecorator extends NotaDePlataAbstracta {
    protected NotaDePlataAbstracta notaDePlata;

    public AbstractDecorator(NotaDePlataAbstracta notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

}
