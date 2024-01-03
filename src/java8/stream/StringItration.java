package java8.stream;

import java.util.Arrays;
import java.util.List;

public class StringItration {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello","Interview","Questions","Answers");
        System.out.println(strings.stream()
                .count()

        );
    }
}
