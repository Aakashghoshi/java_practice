package Inheritance;

public class A {

    int i;
    {
        System.out.println("In  Instance Initialization Block");
    }

    static {
        System.out.println("In satic Block of A");
    }

    public void getA(){
        System.out.println("in Class A get method");
    }

    A() {
        System.out.println("Class A constructor");
    }

}
