package java8.collector;

import java.util.*;
import java.util.stream.Collectors;

public class Partition {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Paul", 11, "Economics", 78.9));
        studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
        studentList.add(new Student("Harish", 13, "History", 83.7));
        studentList.add(new Student("Xiano", 14, "Literature", 71.5));
        studentList.add(new Student("Soumya", 15, "Economics", 77.5));
        studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
        studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
        studentList.add(new Student("Mitshu", 18, "History", 73.5));
        studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
        studentList.add(new Student("Harry", 20, "History", 71.9));

        Map<Boolean, List<Student>> msp1 = studentList.stream().collect(Collectors.partitioningBy(student -> student.getPercentage() > 75));
        System.out.println(msp1);

        Iterator<Map.Entry<Boolean, List<Student>>> it = msp1.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Boolean, List<Student>> pair = it.next();
            if (pair.getKey()) {
                System.out.println("Aakash");
                pair.getValue().stream().collect(Collectors.toList()).stream().map(student -> student.getName()).forEach(System.out::println);
            } else {
                System.out.println("Singh");
                pair.getValue().stream().collect(Collectors.toList()).forEach(System.out::println);
            }
        }


        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        Map<Boolean, List<Integer>> oddEvenNumbersMap =
                listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(oddEvenNumbersMap);

        Set<Map.Entry<Boolean, List<Integer>>> entrySet = oddEvenNumbersMap.entrySet();

        for (Map.Entry<Boolean, List<Integer>> entry : entrySet) {
            System.out.println("--------------");

            if (entry.getKey()) {
                System.out.println("Even Numbers");
            } else {
                System.out.println("Odd Numbers");
            }

            System.out.println("--------------");

            List<Integer> list = entry.getValue();

            for (int i : list) {
                System.out.println(i);
            }
        }
    }
}
