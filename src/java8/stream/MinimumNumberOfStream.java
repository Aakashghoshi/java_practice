package java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class MinimumNumberOfStream {
    public static void main(String[] args) {
        Stream<String> list = Stream.of("aalas","sdxinfg","cofjd","fsdjgds","fnsdfb","mfdf","fbdznf");
       // System.out.println(list.min(Comparator.comparing(Integer::valueOf)));

        System.out.println("sasas");
       list.sorted(Comparator.comparing(String::length)).forEach(System.out::println);

       String[] str = new String[]{"Aakash", "singh","chandel","Thakur","Aakash"};
        System.out.println(Arrays.stream(str));
       Stream<String> stream = Arrays.stream(str);
        Arrays.stream(str).sorted().forEach(System.out::println);
        System.out.println("chandu");
        stream.min(Comparator.comparing(String::valueOf));
    }
}
