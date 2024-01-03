package java8.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StudentIMPL {

    public static void main(String[] args) {

        List<Student> listOfStu = new ArrayList<>();
        listOfStu.add(new Student("Aakash",1,"Math",60.44));
        listOfStu.add(new Student("Akshat",2,"commerce",70.44));
        listOfStu.add(new Student("Ayush",3,"Art",80.44));
        listOfStu.add(new Student("brjesh",4,"Math",90.44));
        listOfStu.add(new Student("surendra",5,"art",66.44));
        listOfStu.add(new Student("deven",6,"bio",40.44));

        Map<Boolean,List<Student>> studentpartition = listOfStu.stream().collect(Collectors.partitioningBy(stu->stu.getPercentage()>60));
        System.out.println(studentpartition);

        List<Student> top3Stu = listOfStu.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).collect(Collectors.toList());
        System.out.println(top3Stu);

        Map<String,Double> stunameper = listOfStu.stream().collect(Collectors.toMap(Student::getName,Student::getPercentage));


        Set<String> subjects = listOfStu.stream().map(Student::getSubject).collect(Collectors.toSet());

        Set<String> subjects2 = listOfStu.stream().map(Student::getSubject).collect(Collectors.toSet());

        DoubleSummaryStatistics studentStats = listOfStu.stream().collect(Collectors.summarizingDouble(Student::getPercentage));

        System.out.println("Highest Percentage : "+studentStats.getMax());

        System.out.println("Lowest Percentage : "+studentStats.getMin());

        System.out.println("Average Percentage : "+studentStats.getAverage());
        Long studentCount = listOfStu.stream().collect(Collectors.counting());
        Map<String, List<Student>> studentsGroupedBySubject = listOfStu.stream().collect(Collectors.groupingBy(Student::getSubject));
    }
}
