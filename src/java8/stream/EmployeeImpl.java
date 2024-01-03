package java8.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeImpl {

    public static void main(String[] args) {
        List<Employee> listofEmp = new ArrayList<>();
        listofEmp.add(new Employee(1,"sanjay",30,"male","IT",2015,29000));
        listofEmp.add(new Employee(1,"abhisek",38,"male","CSE",2016,19000));
        listofEmp.add(new Employee(1,"ayush",35,"male","ME",2016,22000));
        listofEmp.add(new Employee(1,"ankush",29,"male","CIVIL",2017,28000));
        listofEmp.add(new Employee(1,"ayushi",24,"female","CSE",2018,40000));
        listofEmp.add(new Employee(1,"sandhya",22,"female","auto",2012,50000));

        for (Employee emp: listofEmp){
            System.out.println(emp.name);
        }
//Given a list of employees, write a Java 8 code to count the number of employees in each department?
        Map<String,Long> employeeCountByDepartment = listofEmp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(employeeCountByDepartment);


//55) Given a list of employees, find out the average salary of male and female employees?
        Map<String,Double> avgSalaryOfMaleAndFemaleEmployees = listofEmp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryOfMaleAndFemaleEmployees);


//56) Write a Java 8 code to get the details of highest paid employee in the organization from the given list of employees?
        Optional<Employee> highestPaidEmployeeWrapper = listofEmp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary).reversed()));
        Optional<Employee> hi = listofEmp.stream().sorted(Comparator.comparing(Employee::getName)).findFirst();
        System.out.println("aa"+hi);

        System.out.println(highestPaidEmployeeWrapper.get().salary);


//57) Write the Java 8 code to get the average age of each department in an organization?
        Map<String, Double> avgAgeOfEachDepartment = listofEmp.stream().collect(Collectors.groupingBy(Employee::getDepartment , Collectors.averagingDouble(Employee::getAge)));
        System.out.println(avgAgeOfEachDepartment);


       // 58) Given a list of employees, how do you find out who is the senior most employee in the organization?


        Optional<Employee> seniorMostEmployeeWrapper=
                listofEmp.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        System.out.println(seniorMostEmployeeWrapper);
       // 59) Given a list of employees, get the details of the most youngest employee in the organization?


        Optional<Employee> youngestEmployee =
                listofEmp.stream().min(Comparator.comparingInt(Employee::getAge));
        System.out.println(youngestEmployee);
      //  60) How do you get the number of employees in each department if you have given a list of employees?


        Map<String, Long> employeeCountByDepartment1=
                listofEmp.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(employeeCountByDepartment1);
      //  61) Given a list of employees, find out the number of male and female employees in the organization?


        Map<String, Long> noOfMaleAndFemaleEmployees=
                listofEmp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployees);

        String str = "Welcme to aakash";

        Character ch = str.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s->s.getValue()==1)
                .map(s->s.getKey())
                .findFirst().get();
        System.out.println(ch);


        Optional<Employee> emp = listofEmp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst()    ;
        System.out.println(emp);

        listofEmp.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(s -> System.out.println(s.getName()));







    }
}
