package Assignment5.pragna.assignment.singleton;

/**
 * Create another class in package yourname.assignment.singleton
 * containing a non static String member variable.
 * <p>
 * DefaultInitialization
 */
public class DefaultInitialization {

    String memberVar;

    /**
     * Add a static method that takes String as parameter
     *
     * @param value initialize the member variable, then
     * @return object of that class
     */
    public static DefaultInitialization setMember(String value) {

        /*memberVar = value;*/

        /* Explanation: Here, 'memberVar' is a non-static variable & setMember(String v) is a static method.
         * So, Java does not allow to create a reference to non-static field from a static context.
         * Java also prompts following:
         * 1. create a field 'memberVar'                    : creates a new static variable named 'memberVar'
         * 2. Make 'DefaultInitialization.memberVar' static : makes existing 'memberVar' static
         * 3. Make setMember non-static                     : setMember method will now be non-static
         * 4. Rename reference                              : renames 'memberVar' to formal reference 'value'
         */

        return new DefaultInitialization();
    }

    /**
     * Add a non static method to print the String.
     */
    public void printString() {
        System.out.println("From Non-static method - printing String: " + memberVar);
    }
}
