import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Examole2 {
//    Input - 1,0,2,0,6,0,8,0
//    Output - 1,2,6,8,0,0,0,0
    public static void main(String[] args) {


        Integer[] num = {1,0,2,0,6,0,8,0};

        String[] arr = {"aatyfh","aas","aaasf"};

        Arrays.sort(arr,(s1,s2) ->s1.length() - s2.length());
        Arrays.asList(arr).stream().forEach(System.out::println);

        Arrays.stream(arr).sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        Arrays.sort(num, Comparator.comparing(n->n==0));
        Arrays.stream(num).forEach(System.out::println);

    }
}
