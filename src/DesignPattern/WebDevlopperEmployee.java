package DesignPattern;

public class WebDevlopperEmployee implements Employee{
    @Override
    public int salary() {
        System.out.println("getting Web developer salary");

        return 30000;
    }
}
