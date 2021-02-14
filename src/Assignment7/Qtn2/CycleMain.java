package Assignment7.Qtn2;

/**
 * 1. Create instances of all three types and upcast them to an array of Cycle
 * 2. Try to call balance() on each element of the array and observe the results
 * 3. Downcast and call balance( ) and observe what happens.
 */
public class CycleMain {
    public static void main(String[] args) {

        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        Cycle[] cycleArray = new Cycle[3];
        cycleArray[0] = (Cycle) unicycle;
        cycleArray[1] = (Cycle) bicycle;
        cycleArray[2] = (Cycle) tricycle;

        /* Error : Cannot resolve method 'balance' in 'Cycle'
        *          because, Cycle class doesn't have balance() method
        for(int i=0;i<3;i++){
            cycleArray[i].balance();
        }*/

        Unicycle unicycle1 = (Unicycle) cycleArray[0];
        Bicycle bicycle1 = (Bicycle) cycleArray[1];
        Tricycle tricycle1 = (Tricycle) cycleArray[2];

        unicycle1.balance();
        bicycle1.balance();

        /*Error : Cannot resolve method 'balance' in 'TriCycle'
        *         because, 'TriCycle' class doesn't have balance() method
        tricycle1.balance();*/

    }
}
