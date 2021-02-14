package Assignment7.Qtn1;

public interface Rodent {
    void getInformation();
}

class Mouse implements Rodent {
    public Mouse() {
        System.out.println("Mouse constructor invoked");
    }

    @Override
    public void getInformation() {
        System.out.println("Hi, I am Mouse : Rodent");
    }

}

class Gerbil implements Rodent {
    public Gerbil() {
        System.out.println("Gerbil constructor invoked");
    }

    @Override
    public void getInformation() {
        System.out.println("Hi, I am Gerbil : Rodent");
    }

}


class Hamster implements Rodent {

    public Hamster() {
        System.out.println("Hamster constructor invoked");
    }

    @Override
    public void getInformation() {
        System.out.println("Hi, I am Hamster : Rodent");
    }

}

