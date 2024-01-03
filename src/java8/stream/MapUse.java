package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapUse
{
    public static void main(String[] args) {
        //If you have a List of String and you want to convert that to a List of Integer, you can use map() to do so.

        List<String> listOfString = Arrays.asList("1","2","3","4","5","6");

        List<Integer> listOfInteger = listOfString.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println("whose valuse grater than 3");
        listOfInteger.stream()
                        .filter(s ->s>3)
                                .forEach(System.out::println);

        System.out.println("Conerted List of String into list of integer");
        listOfInteger.forEach(System.out::println);
    }
}
