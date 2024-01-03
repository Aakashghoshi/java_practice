package java8;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class FindSecondLargestNumberInAnArraysUsingJava8Stream {

    public static void main(String[] args) {

        // random numbers
        int[] numbers = {5, 9, 11, 2, 8, 21, 1,19};



        // print to console
        System.out.println("Numbers in an Arrays : "
                + Arrays.toString(numbers));


        // Execution - start time
        // LocalTime startTime = LocalTime.now();


        // sort in descending-order and get 2nd largest element
        int secondLargestNumber = Arrays
                .stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .findFirst()
                .get();


        // Execution - end time
     //  LocalTime endTime = LocalTime.now();


        // find difference
     //   Duration duration = Duration.between(startTime, endTime);
     //   long differenceInNano = duration.getNano();


        // print sum to console
        System.out.println("\nSecond largest number in an Arrays is - "
                + secondLargestNumber);


        // print execution time in Nano seconds
      //System.out.println("\nExecution time - "
        // + differenceInNano + " ns");
    }
}
