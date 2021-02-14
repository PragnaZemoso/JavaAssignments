package Assignment6.Qtn3;

public class Main {
    public static void main(String[] args) {

        /**
         * When we run the program, initialization messages from the constructor calls are NOT printed.
         * because, 'arrayOfObjects' will just create an array of object references to ConstructorWithArrayOfObjects class,
         * doesn't create objects actually
         */
        ConstructorWithArrayOfObjects[] arrayOfObjects = new ConstructorWithArrayOfObjects[5];


        /**
         * Qtn 4: Complete the exercise by creating objects to attach to the array of references.
         *
         * in order to create objects, use new keyword
         * Now, the initialization messages from the constructor calls are printed.
         */

        for (int i = 0; i < arrayOfObjects.length; i++) {
            arrayOfObjects[i] = new ConstructorWithArrayOfObjects("ABC" + (i));
        }

    }
}
