package Inheritance;

public class B extends A {

    int j;

    static {
        System.out.println("In satic Block of B");
    }
    B(){
        super.getA();
        System.out.println("Class B Constructor  ");
    }
}
