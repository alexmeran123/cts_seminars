package singleton;

import singleton.model.Director;
import singleton.model.Papa;

public class Main {
  public static void main(String[] args) {
    Papa papa = Papa.getInstance();
    Papa papa1 = Papa.getInstance();
    System.out.println(papa);
    System.out.println(papa1);

    Director director = Director.getInstance("Meran");
    System.out.println(director);
    Director director2 = Director.getInstance("Alex");
    System.out.println(director2);
  }
}
