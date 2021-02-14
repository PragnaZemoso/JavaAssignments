package Assignment7.Qtn5;

public class SecondOuterClass {
    public SecondOuterClass() {
        System.out.println("SecondOuterClass constructor invoked");
    }

    static class SecondInnerClass extends FirstOuterClass.FirstInnerClass {

        // It is required to create a non-default constructor to match 'FirstOuterClass.FirstInnerClass' s constructor
        public SecondInnerClass(String text) {
            super(text);
            System.out.println(text + " Inner Class non-default Constructor of 'SecondOuterClass' invoked");
        }
    }
}
