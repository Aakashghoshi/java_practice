import java8.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StramExapmle {

    public static void main(String[] args) {

        List<Integer> list  = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //sum of square of all odd num
        System.out.println("sumOfOdd= "+sumOfOdd(list));

        //sum of square of all even num
        System.out.println("sumOfEven= "+sumOfEven(list));

        List<Employee> empList = Employee.getEmpList(10);
        System.out.println(empList);
        empList.stream().filter(e->e.getSalary()>25000).forEach(System.out::print);

    }

    public static int sumOfOdd(List<Integer> list){
        return list.stream().filter(s->s%2!=0).mapToInt(s->s*s).sum();
    }

    public static int sumOfEven(List<Integer> list){
        return list.stream().filter(s->s%2==0).mapToInt(s->s*s).sum();
    }

    public static void getEmp(){
//        return list.stream().collect(Collectors.groupingBy());
        System.out.println(Employee.getEmpList(10));
    }
}
