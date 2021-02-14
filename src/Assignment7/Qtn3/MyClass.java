package Assignment7.Qtn3;

public class MyClass extends ConcreteClass implements NewInterface {

    public void firstMethod(InterfaceOne interfaceOne){
        System.out.println("firstMethod() takes InterfaceOne object as argument");
    }

    public void secondMethod(InterfaceTwo interfaceTwo){
        System.out.println("secondMethod() takes InterfaceTwo object as argument");
    }

    public void thirdMethod(InterfaceThree interfaceThree){
        System.out.println("thirdMethod() takes InterfaceThree object as argument");
    }
    public void fourthMethod(NewInterface newInterface){
        System.out.println("fourthMethod() takes NewInterface object as argument");
    }

    @Override
    public void methodOneOfInterfaceOne() {

    }

    @Override
    public void methodTwoOfInterfaceOne() {

    }

    @Override
    public void methodOneOfInterfaceTwo() {

    }

    @Override
    public void methodTwoOfInterfaceTwo() {

    }

    @Override
    public void methodOneOfInterfaceThree() {

    }

    @Override
    public void methodTwoOfInterfaceThree() {

    }

    @Override
    public void newMethod() {

    }




}
