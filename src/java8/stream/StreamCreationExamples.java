package java8.stream;

import java.lang.reflect.Array;
import java.util.stream.Stream;

public class StreamCreationExamples {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Aakash", "Singh","thakur");
        stream.forEach(System.out::println);

    }
}
