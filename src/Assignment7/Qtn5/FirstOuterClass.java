package Assignment7.Qtn5;

public class FirstOuterClass {
    public FirstOuterClass() {
        System.out.println("FirstOuterClass constructor invoked");
    }

    // Inner class should be static in order to be extended in other classes
    static class FirstInnerClass {
        public FirstInnerClass(String text) {
            System.out.println(text + " - Inner Class non-default Constructor of 'FirstOuterClass' invoked");
        }
    }
}
