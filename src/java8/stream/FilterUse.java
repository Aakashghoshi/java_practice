package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterUse {
    public static void main(String[] args){
        List<String> lines = Arrays.asList("java", "c", "python","java");

        List<String> result = lines.stream()       // convert list to stream
                .filter(line -> "java".equals(line)) // we dont like c
                .collect(Collectors.toList());     // collect the output and convert streams to a List

        result.forEach(System.out::println);
        System.out.println(result.stream().count());
    }
}
