package collection;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 2, 3, 4, 5, 8, 7, 6);
        int val = list.stream().min((s1,s2) -> s1.compareTo(s2)).get();

        System.out.println("chandu"+val);

        Optional<Integer> val2 = list.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst();
        System.out.println(val2.get());
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);


        String[] strArr = {"ABCD", "AB", "ABCDEFG", "ABC", "A", "ABCDE", "ABCDEF", "ABCDEFGHIJ"};

        System.out.println("Sorting array on the basis of their lengths (shortest to longest) =");

        Arrays.sort(strArr, (str1, str2) -> str1.length() - str2.length());


        Arrays.asList(strArr).forEach(System.out::println);


        String input = "This is a beautiful world";

        List<String> listof = new ArrayList<>();

        String [] str = input.split(" ");

        listof = Arrays.asList(str);


        char[] input1 = input.toCharArray();


        String[] fff = input.split(" ");
        System.out.println(fff.length);


        // Arrays.stream(fff).sorted().forEach(System.out::println);

        Arrays.stream(strArr).sorted(Comparator.comparing(String::length)).forEach(System.out::println);


        String[] arr = Arrays.stream(input.split(" "))
                .sorted(Comparator.comparingInt(String::length))
                .toArray(String[]::new);
// prints output
        System.out.println(Arrays.toString(arr));

        List<Integer> li = Arrays.asList(1,3,4,5,6,7,8,9);
        li.stream().filter(s -> s%2==0).collect(Collectors.toList()).forEach(System.out::println);

        String[] strarr = {"Aakash", "singh", "ghooshi", "raj"};
        Map<String,Long> map1 = Arrays.stream(strarr).sorted(Comparator.comparing(String::length)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Arrays.sort(strarr, (str1, str2) -> str1.length() - str2.length());

        for (String sh : strarr) {
            System.out.println(sh);
        }

        String str3 = "Aakash is software engineer";

        String[] at = Arrays.stream(str3.split(" ")).sorted(Comparator.comparingInt(String::length)).toArray(String[]::new);
        System.out.println(Arrays.toString(at));


    }
}
