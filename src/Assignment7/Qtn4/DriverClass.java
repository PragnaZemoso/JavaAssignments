package Assignment7.Qtn4;

public class DriverClass {
    public static void main(String[] args) {
        UnicycleFactory unicycleFactory = new UnicycleFactory();
        Cycle c1 = unicycleFactory.getCycle();
        c1.ride();

        BicycleFactory bicycleFactory = new BicycleFactory();
        Cycle c2 = bicycleFactory.getCycle();
        c2.ride();

        TricycleFactory tricycleFactory = new TricycleFactory();
        Cycle c3 = tricycleFactory.getCycle();
        c3.ride();
    }
}
