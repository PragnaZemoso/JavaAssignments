package Assignment7.Qtn4;

public class Unicycle implements Cycle {

    public Unicycle() {
        System.out.println("constructor of Class 'Unicycle' is invoked");
    }

    @Override
    public void ride() {
        System.out.println("Unicycle - riding on One wheel");
    }
}