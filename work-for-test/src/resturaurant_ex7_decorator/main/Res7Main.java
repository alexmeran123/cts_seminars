package resturaurant_ex7_decorator.main;

import resturaurant_ex7_decorator.model.DecoratorNotaPlata;
import resturaurant_ex7_decorator.model.NotaDePlata;
import resturaurant_ex7_decorator.model.NotaDePlataAbstracta;

public class Res7Main {
    public static void main(String[] args) {
        NotaDePlataAbstracta notaDePlata = new NotaDePlata();
        notaDePlata.printeazaNota();

        NotaDePlataAbstracta notaDePlataSarbatori = new DecoratorNotaPlata(notaDePlata);
        notaDePlataSarbatori.printeazaNota();
    }
}
