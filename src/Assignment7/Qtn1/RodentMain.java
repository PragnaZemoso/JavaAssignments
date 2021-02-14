package Assignment7.Qtn1;

public class RodentMain {
    public static void main(String[] args) {
        Rodent[] rodentArray = new Rodent[3];
        rodentArray[0] = new Mouse();
        rodentArray[1] = new Gerbil();
        rodentArray[2] = new Hamster();

        for (int i = 0; i < 3; i++) {
            System.out.println("------------------------------------");
            rodentArray[i].getInformation();
        }
    }
}
