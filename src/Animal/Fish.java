package Animal;

/**
 * Created by GAGAN on 08/01/2018.
 */
public class Fish extends Animals{
    int gills;
    int fins;
    int eyes;

    public Fish(String name,  int size, int weight, int gills, int fins, int eyes) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }
    private void rest(){

    }
    private void moveMuscles(){

    }
    private void backFinMove(){

    }
    private void swim(int speed){
        moveMuscles();
        backFinMove();
        super.move(speed);
    }
}
