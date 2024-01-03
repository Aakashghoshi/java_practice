package DesignPattern;

public class EmployeeFactory

{

    public static Employee getEmployee(String empType){

        if(empType.trim().equalsIgnoreCase("Android Develper")) {
            return new AndroidEmployee();
        }
        else if (empType.trim().equalsIgnoreCase("web Develper")) {
            return new WebDevlopperEmployee();
        }
        else
        {
            return null;
        }


    }
}
