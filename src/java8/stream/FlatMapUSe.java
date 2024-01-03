package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapUSe {
    public static void main(String[] args) {











     //   List<Integer> lidt = Stream.of(ak,val2).flatMap(list -> list.stream()).collect(Collectors.toList());


        List<Integer> even = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(3, 5,2, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);

        List<Integer> numbers = Stream.of(even, odds, primes)

                .flatMap(list -> list.stream())
                .map(s -> s*s)
                .collect(Collectors.toList());

        numbers.forEach(System.out::println);
       // System.out.println(numbers);
    }


}

