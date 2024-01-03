package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DistictUse {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList();

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("one");
        stringList.add("two");
        stringList.add("four");

        Stream<String> str = stringList.stream();

        str.distinct().forEach(System.out::println);

      // stringList.stream().distinct().forEach(System.out::println);
    }
}
