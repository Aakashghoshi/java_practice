package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

// List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
public class EvenNo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        list.stream().filter(s -> s % 2 == 0).forEach(System.out::println);
          }
}

