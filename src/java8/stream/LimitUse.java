package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LimitUse {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("one");
        stringList.add("two");
        stringList.add("four");

        stringList.stream().limit(6).forEach(System.out::println);

    }
}
