package Assignment7.Qtn5;

public class MainClass {
    public static void main(String[] args) {
        FirstOuterClass firstOuterClass = new FirstOuterClass();
        SecondOuterClass secondOuterClass = new SecondOuterClass();
        FirstOuterClass.FirstInnerClass firstInnerClass = new FirstOuterClass.FirstInnerClass("HELLO!!");
        System.out.println("---------------------");
        SecondOuterClass.SecondInnerClass secondInnerClass = new SecondOuterClass.SecondInnerClass("World");
    }
}
