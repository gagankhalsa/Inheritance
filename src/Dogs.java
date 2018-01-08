/**
 * Created by GAGAN on 08/01/2018.
 */
public class Dogs extends Animals {
    int eyes;
    int tail;
    int teeth;



    public Dogs(String name, int size, int weight, int eyes, int tail, int teeth) {
        super(name,1,1, size, weight);
        this.eyes=eyes;
        this.tail=tail;
        this.teeth=teeth;
    }
    @Override
    public void eat() {
        System.out.println("dog.eat called");
        super.eat();
    }
}
