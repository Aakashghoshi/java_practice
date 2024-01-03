package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class test1 {

    public static void main(String[] args) {

        int[] numbers = {5, 9, 11, 1, 8, 21, 1};
        int secondSmallestNumber = Arrays
                .stream(numbers)
                .boxed()
                .distinct()
                .sorted(Comparator.naturalOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondSmallestNumber);

        int secondSmallestNumber2 = Arrays
                .stream(numbers)
                .boxed()
                .sorted(Comparator.naturalOrder())
                .limit(2)
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondSmallestNumber2);

        List<Integer> numbers1 = Arrays.asList(5, 9, 11, 2, 8, 21, 1);

        int scond = numbers1.stream().sorted(Comparator.naturalOrder()).skip(1).findFirst().get();
        System.out.println(scond);



    }
}
