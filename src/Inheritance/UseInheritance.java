package Inheritance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UseInheritance {
    public static void main(String[] args) {
        A a  = new A();
        A b  = new A();

        System.out.println("Aakash");
       A c = new B();

       List<String> list  = Arrays.asList("Aakash","singh","singh","thakur","chandel","ghoshi","arvinf");

        list.stream().sorted(Comparator.comparing(String::valueOf)).forEach(System.out::println);
   //     int max = list.stream().max((i,j) -> i.compareTo(j)).get();

       // System.out.println(max);

    }
}
