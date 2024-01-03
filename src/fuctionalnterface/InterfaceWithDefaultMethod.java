package fuctionalnterface;

interface InterfaceWithDefaultMethod1{
    void abbstractMethod();
    default  void defaultMethod(){
        System.out.println("Default method ");
    }
}

public class InterfaceWithDefaultMethod implements InterfaceWithDefaultMethod1 {

    public static void main(String[] args) {
        new InterfaceWithDefaultMethod().abbstractMethod();
        new InterfaceWithDefaultMethod().defaultMethod();
    }


    @Override
    public void abbstractMethod() {
        System.out.println("in abs");

    }

    @Override
    public void defaultMethod() {
        System.out.println("aakasjaslkdhs");
    }
}
