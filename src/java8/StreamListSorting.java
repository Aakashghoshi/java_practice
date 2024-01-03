package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamListSorting {
    public static void main(String[] args) {


        String substr = "hello1,world2,hello3";
        String[] spltedstr = substr.split(",");

        for (int i = spltedstr.length - 1; i >= 0; i--) {
            System.out.print(spltedstr[i] + ",");
        }





//
//        String s1 = "hello world";
//        String s2 = "hello world";
//        String s3 = new String("hello world");
//        System.out.println(s1 == s2); // true
//        System.out.println(s1 == s3); // false
//        System.out.println(s1.equals(s2)); // true
//        System.out.println(s1.equals(s3)); // true


        String word = "AAABBBCCCC";


        Map<String, Long> charCount = word.chars().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount);


        List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 5, 7, 7);


        List<String> listOfStr = Arrays.asList("aakash", "singh", "aakash", "singh", "ghoshi");

        Map<String, Long> mapofstring = listOfStr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(mapofstring);


        Map<Integer, Long> assas = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map listOfInt = new TreeMap(assas);

        System.out.println(listOfInt);
        System.out.println(assas);
        List<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Mango");
        fruits.add("Apple");


        Map<String, Long> gruoping = fruits.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));
        System.out.println(gruoping);

        List<String> sort = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        List<String> reverseSort = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorting of String Arraylist :   " + sort);
        System.out.println("Reversr Sorting of String Arraylist :   " + reverseSort);


        List<Employee> listOfEmployee = new ArrayList<Employee>();

        listOfEmployee.add(new Employee(10, "Ramesh", 30, 400000));
        listOfEmployee.add(new Employee(20, "John", 29, 350000));
        listOfEmployee.add(new Employee(30, "Tom", 30, 450000));
        listOfEmployee.add(new Employee(40, "Pramod", 28, 500000));


        String emp22 = listOfEmployee.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).findFirst().map(Employee::getName).get();
        System.out.println("Aakash is best" + emp22);

        Map<String, Integer> listof = listOfEmployee.stream().filter(s -> s.getAge() >= 29).collect(Collectors.toMap(Employee::getName, Employee::getAge));
        System.out.println("Aakash SIngh Ji: " + listof);


        System.out.println("Chandel");

        listOfEmployee.stream().filter(age -> age.getAge() > 29).map(name -> name.getName()).collect(Collectors.toList()).forEach(System.out::println);

        Optional<Employee> secoh = listOfEmployee.stream().distinct().sorted(Comparator.comparingInt(Employee::getAge).reversed()).skip(1).findFirst();
        System.out.println(secoh.get().getAge());
        Long sum = listOfEmployee.stream().collect(Collectors.summingLong(Employee::getAge));
        System.out.println("Sum of salary" + sum);

        // System.out.println(listOfEmployee);


//        Optional<Employee> emp = listOfEmployee.stream()
        //  .collect(Collectors.maxBy(Comparator.comparingLong(Employee::getSalary).reversed()
        Optional<Employee> emp = listOfEmployee.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).findFirst();

        System.out.println("Second highest" +
                emp.get().getSalary());


        Employee maxsal = listOfEmployee.stream().max((pro1, pro2) -> pro1.getSalary() > pro2.getSalary() ? 1 : -1).get();

        System.out.println("Highest salary of the empl salary " + maxsal.getSalary());

        Employee minsal = listOfEmployee.stream().min((P1, P2) -> P1.getSalary() > P2.getSalary() ? 1 : -1).get();
        System.out.println("Lowest salary of the empl salary " + minsal.getSalary());


        List<Employee> sortedEmployee = listOfEmployee.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
        List<Employee> string1 = listOfEmployee.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
        System.out.println("name sorting " + string1);


        String str31 = "teetekr";

        for (char ch : str31.toCharArray()) {
            if (str31.indexOf(ch) == str31.lastIndexOf(ch)) {
                System.out.println("Non repeating character" + ch);
                break;
            }

        }


        System.out.println(sortedEmployee);

        for (Employee ch : sortedEmployee) {
            System.out.println(ch.getAge());
        }

    }
}
