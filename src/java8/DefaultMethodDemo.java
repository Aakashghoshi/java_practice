package java8;

interface Printable{
    // Default method
    default void print() {
        System.out.println("Printing...");
    }
    default void print2D() {
        System.out.println("Printing 2D...");
    }
    // Abstract methods
    void print3D();
}



public class DefaultMethodDemo implements Printable {

    public void print3D() {
        System.out.println("Printing 3D...");
    }

    public void print2D() {
        System.out.println("Printing 2D from DefaultMethodDemo...");
    }

    public static void main(String[] args){

        DefaultMethodDemo demo = new DefaultMethodDemo();
        // Calling Default Methods
        demo.print();
        demo.print2D();
        // Calling Abstract Methods
        demo.print3D();

    }
}