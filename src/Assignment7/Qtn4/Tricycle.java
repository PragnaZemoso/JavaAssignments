package Assignment7.Qtn4;

public class Tricycle implements Cycle {

    public Tricycle() {
        System.out.println("constructor of Class 'Tricycle' is invoked");
    }

    @Override
    public void ride() {
        System.out.println("Tricycle - riding on three wheel");
    }
}