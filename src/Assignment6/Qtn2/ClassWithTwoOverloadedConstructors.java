package Assignment6.Qtn2;

public class ClassWithTwoOverloadedConstructors {
    public ClassWithTwoOverloadedConstructors(String name) {

        //calling the second constructor inside the first one using this()
        this(name, 123);
        System.out.println(name + " : Constructor with ('String') argument");
    }

    public ClassWithTwoOverloadedConstructors(String input, int number) {
        System.out.println(input + " & " + number + " : Constructor with ('String','int') arguments");
    }
}
