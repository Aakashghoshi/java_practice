package collection;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicate {
    public static void main(String[] args) {


        List<Integer> list11 = Arrays.asList(1,4,3,22,7,5,84,47,12);


        list11.stream().sorted().forEach(System.out::println);

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        Iterator<Integer> it = list.iterator();

        list.stream().distinct().forEach(System.out::println);

       Map<Integer,Long> asas= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(asas);

       Optional<Integer> aj =list.stream().max(Comparator.comparing(Integer::intValue));
        System.out.println(aj);

    }
}
