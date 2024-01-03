package DesignPattern;

public class DevelopperClient {
    public static void main(String[] args) {
    Employee emp = EmployeeFactory.getEmployee("web Develper");
    emp.salary();
        System.out.println(emp.salary());
    }
}
