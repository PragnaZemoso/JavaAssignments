package Assignment7.Qtn3;

interface InterfaceOne {
    void methodOneOfInterfaceOne();

    void methodTwoOfInterfaceOne();
}

interface InterfaceTwo {
    void methodOneOfInterfaceTwo();

    void methodTwoOfInterfaceTwo();
}

interface InterfaceThree {
    void methodOneOfInterfaceThree();

    void methodTwoOfInterfaceThree();
}

interface NewInterface extends InterfaceOne, InterfaceTwo, InterfaceThree {
    void newMethod();
}