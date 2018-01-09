package Animal;

/**
 * Created by GAGAN on 08/01/2018.
 */
public class Main {
    public static void main (String args[]) {
        Animals animal = new Animals("animal", 1, 1, 5, 5);
        Dogs dog = new Dogs("tom", 5, 8, 2, 1, 20);
    dog.eat();
    dog.run();
    }
}
