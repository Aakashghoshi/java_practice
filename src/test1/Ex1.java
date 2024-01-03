package test1;

import com.sun.tools.javac.Main;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Ex1 {

    public static void main(String[] args) {

        List<Employee> listofemp = new ArrayList<>();

        listofemp.add(new Employee(1,"Aakash","Hr"));
        listofemp.add(new Employee(1,"Singh","It"));
        listofemp.add(new Employee(1,"ghoshi","It"));
        listofemp.add(new Employee(1,"chandel","Fi"));
        listofemp.add(new Employee(1,"thakur","Fi"));
        listofemp.add(new Employee(1,"Arvind","Ad"));
        listofemp.add(new Employee(1,"hemlata","Ad"));
        listofemp.add(new Employee(1,"Ayush","Hr"));
        listofemp.add(new Employee(1,"Akshat","Re"));
        listofemp.add(new Employee(1,"arvind","Re"));
        listofemp.add(new Employee(1,"Kishore","Hr"));
        listofemp.add(new Employee(1,"patel","Ad"));
        listofemp.add(new Employee(1,"Ankush","Fi"));


       Map<String,List<Employee>> map =listofemp.stream().collect(Collectors.groupingBy(Employee::getDept));
//       Set set = map.entrySet();
//        Iterator it = set.iterator();
//        int count=0;
//        while (it.hasNext()){
//            Map.Entry map1 = (Map.Entry)it.next();
//            System.out.println( map1.getValue());
//            System.out.println(count);
//        }
//        listofemp.stream().collect(Collectors.groupingBy(Employee::getDept)).entrySet().stream().forEach(e->{
//            System.out.print("depart:"+e.getKey());
//            System.out.println(" ="+e.getValue().size());});

        listofemp.stream().collect(Collectors.partitioningBy(employee -> employee.getDept().startsWith("A"))).entrySet().stream().forEach(e->{
            System.out.print(e.getKey());
            System.out.println(e.getValue());
        });

    }
}
