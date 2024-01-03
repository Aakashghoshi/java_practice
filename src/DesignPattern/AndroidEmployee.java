package DesignPattern;

public class AndroidEmployee implements Employee{

    @Override
    public int salary() {
        System.out.println("getting android developer salary");
        return 50000;
    }
}
