package Assignment5.pragna.assignment.main;

import Assignment5.pragna.assignment.data.ClassDefaultInitialization;
import Assignment5.pragna.assignment.singleton.DefaultInitialization;

/**
 * Create main class in package yourname.assignment.main,
 * create object of first class and call both the methods to print the values
 * Create object of second class using static method and then call the other method to print the String.
 */
public class DefaultInitializationMain {
    public static void main(String[] args) {

        ClassDefaultInitialization firstClassObject = new ClassDefaultInitialization();
        firstClassObject.printMemberVariables();
        firstClassObject.printLocalVariables();

        DefaultInitialization secondClassObject = DefaultInitialization.setMember("Pragna");
        secondClassObject.printString();
    }
}
