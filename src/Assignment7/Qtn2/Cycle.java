package Assignment7.Qtn2;

/**
 * Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 * Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle.
 */
public class Cycle {
}

class Unicycle extends Cycle {
    public Unicycle() {
        System.out.println("Unicycle constructor invoked");
    }

    public void balance() {
        System.out.println("Unicycle - Balancing on one wheel");
    }
}

class Bicycle extends Cycle {
    public Bicycle() {
        System.out.println("Bicycle constructor invoked");
    }

    public void balance() {
        System.out.println("Bicycle - Balancing on two wheels");
    }
}

class Tricycle extends Cycle {
    public Tricycle() {
        System.out.println("Tricycle constructor invoked");
    }
}

