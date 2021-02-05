package Assignment5.pragna.assignment.data;

/**
 * Create a class in a package yourname.assignment.data
 * containing an int and a char member variables that are not initialized,
 * <p>
 * ClassDefaultInitialization - instance & local variables
 */
public class ClassDefaultInitialization {

    int variable1;
    char variable2;

    /**
     * method to print these member (Instance) variables
     */
    public void printMemberVariables() {
        System.out.println("--------- Printing default values of 2 Member variables ---------");
        System.out.println("variable1: " + variable1);
        System.out.println("variable2: " + variable2);
    }

    /**
     * Add another method in the same class
     * with two local variables and
     * print their values without initializing them.
     */
    public void printLocalVariables() {
        char localVar1;
        int localVar2;

        /*
        System.out.println("Local variable1: " + localVar1);
        System.out.println("Local variable2: " + localVar2);
        */

        System.out.println("printLocalVariables() --> Local variables are not given initial default values");

        /*
         Explanation: When Local variables are declared but not initialized, the Compiler will prompt us to initialize them saying
         * Variable 'localVar1' might not have been initialized.
         * So, Initialization of Local Variables is Mandatory.
         *
         * Because, The scope of these variables exists only within the block in which the variable is declared.
         * i.e. we can access these variable only within that block. When we are not assigning any values or using them in method, then there is no use of simply declaring local variables.
         *
         * Local variables are not given initial default values. Thus, we must assign a value before you use a local variable.
         */


    }
}
