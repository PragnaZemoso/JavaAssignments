package Assignment7.Qtn5;

// Alternate way of non-static Inner classes
class Class_A{
    class Inner_1{
        Inner_1(String a){
            System.out.println(a + " Inside Innerclass 1");
        }
    }
}
class Class_B extends Class_A{
    class Inner_2 extends Inner_1 {
        Inner_2(String b){
            super(b);
            System.out.println(b + " Inside Innerclass 2");
        }
    }
}

public class InnerClass_AlternateWay {

    public static void main(String[] args) {
        Class_A class_a = new Class_A();
        Class_A.Inner_1 inner_1 = class_a.new Inner_1("asdfg"); // This kind of call

        Class_B class_b=new Class_B();
        Class_B.Inner_2 inner = class_b.new Inner_2("ASDFG");

    }
}
