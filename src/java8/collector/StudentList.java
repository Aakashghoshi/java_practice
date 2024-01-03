package java8.collector;

import java.util.*;
import java.util.stream.Collectors;

public class StudentList {
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

        List<Student> top3Students = studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).collect(Collectors.toList());

        System.out.println(top3Students);
        System.out.println("Aakash Ji:");
        Map<Double, List<Student>> map4 = studentList.stream().collect(Collectors.groupingBy(Student::getPercentage));
        Map<String, List<Student>> map2 = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));

        for (Map.Entry<Double, List<Student>> entry : map4.entrySet()) {
            System.out.print("Key = " + entry.getKey());

            for (Student li : entry.getValue()) {
                System.out.println("  " + li.name);
            }

        }


        //Output :

        //[Vijay-19-Mathematics-92.8, Zevin-12-Computer Science-91.2, Asif-16-Mathematics-89.4]

        Set<String> subjects = studentList.stream().map(Student::getSubject).collect(Collectors.toSet());

        System.out.println(subjects);

//Output :

//[Economics, Literature, Computer Science, Mathematics, History]

        Map<String, Double> namePercentageMap = studentList.stream().collect(Collectors.toMap(Student::getName, Student::getPercentage));

        System.out.println(namePercentageMap);

//Output :

//{Asif=89.4, Vijay=92.8, Zevin=91.2, Harry=71.9, Xiano=71.5, Nihira=84.6, Soumya=77.5, Mitshu=73.5, Harish=83.7, Paul=78.9}

        LinkedList<Student> studentLinkedList = studentList.stream().limit(3).collect(Collectors.toCollection(LinkedList::new));

        System.out.println(studentLinkedList);

//Output :

//[Paul-11-Economics-78.9, Zevin-12-Computer Science-91.2, Harish-13-History-83.7]

        String namesJoined = studentList.stream().map(Student::getName).collect(Collectors.joining(", "));

        System.out.println(namesJoined);

//Output :

//Paul, Zevin, Harish, Xiano, Soumya, Asif, Nihira, Mitshu, Vijay, Harry

        Long studentCount = studentList.stream().collect(Collectors.counting());

        System.out.println(studentCount);

//Output : 10

        Optional<Double> highPercentage = studentList.stream().map(Student::getPercentage).collect(Collectors.maxBy(Comparator.naturalOrder()));

        System.out.println(highPercentage);

//Output : Optional[92.8]

        Optional<Double> lowPercentage = studentList.stream().map(Student::getPercentage).collect(Collectors.minBy(Comparator.naturalOrder()));

        System.out.println(lowPercentage);

//Output : Optional[71.5]

        Double sumOfPercentages = studentList.stream().collect(Collectors.summingDouble(Student::getPercentage));

        System.out.println(sumOfPercentages);

//Output : 815.0

        Double averagePercentage = studentList.stream().collect(Collectors.averagingDouble(Student::getPercentage));

        System.out.println(averagePercentage);

//Output : 81.5

        DoubleSummaryStatistics studentStats = studentList.stream().collect(Collectors.summarizingDouble(Student::getPercentage));

        System.out.println("Highest Percentage : " + studentStats.getMax());

        System.out.println("Lowest Percentage : " + studentStats.getMin());

        System.out.println("Average Percentage : " + studentStats.getAverage());

//Output :

//Highest Percentage : 92.8
//Lowest Percentage : 71.5
//Average Percentage : 81.5

        Map<String, List<Student>> studentsGroupedBySubject = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));

        System.out.println("Group bty" + studentsGroupedBySubject);

//Output :

//{Economics=[Paul-11-Economics-78.9, Soumya-15-Economics-77.5],
// Literature=[Xiano-14-Literature-71.5],
// Computer Science=[Zevin-12-Computer Science-91.2, Nihira-17-Computer Science-84.6],
// Mathematics=[Asif-16-Mathematics-89.4, Vijay-19-Mathematics-92.8],
// History=[Harish-13-History-83.7, Mitshu-18-History-73.5, Harry-20-History-71.9]}

        Map<Boolean, List<Student>> studentspartionedByPercentage = studentList.stream().collect(Collectors.partitioningBy(student -> student.getPercentage() > 80.0));

        System.out.println("p" + "p" + studentspartionedByPercentage);

//Output :

// {false=[Paul-11-Economics-78.9, Xiano-14-Literature-71.5, Soumya-15-Economics-77.5, Mitshu-18-History-73.5, Harry-20-History-71.9],
//  true=[Zevin-12-Computer Science-91.2, Harish-13-History-83.7, Asif-16-Mathematics-89.4, Nihira-17-Computer Science-84.6, Vijay-19-Mathematics-92.8]}

        List<Student> first3Students = studentList.stream().limit(3).collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));

        System.out.println(first3Students);

//Output :

//[Paul-11-Economics-78.9, Zevin-12-Computer Science-91.2, Harish-13-History-83.7]


    }
}
