package Assignment7.Qtn4;

public class Bicycle implements Cycle {

    public Bicycle() {
        System.out.println("constructor of Class 'Bicycle' is invoked");
    }

    @Override
    public void ride() {
        System.out.println("Bicycle - riding on Two wheel");
    }
}