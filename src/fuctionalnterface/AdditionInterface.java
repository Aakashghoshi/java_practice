package fuctionalnterface;

@FunctionalInterface

interface   MyAddition{
    int addition(int a, int b);

    default void test(){
        System.out.println("Inside My addition");
    }
}

@FunctionalInterface

interface Mysubstracion  {
    void substrction(int a, int b);

    default void test(){
        System.out.println("Inside My addition");
    }
}

public class AdditionInterface {
    public static void main(String[] args) {
        MyAddition add = (a,b) -> a+b;

        int reslt = add.addition(1,3);
        System.out.println(reslt);

        Mysubstracion sub = (a, b)->{
            System.out.println(a-b);
            System.out.println(a+b);
        };


        sub.substrction(3,5);
    }
}
