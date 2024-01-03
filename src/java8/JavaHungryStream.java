package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaHungryStream {
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32,32,32);
        myList.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("aaaa");
        myList.stream()
                .map(s-> s +"")
                .filter(s -> s.startsWith("3"))
                .forEach(System.out::println);



    //How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> myList2 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<>();
        System.out.println("aaaaaaaaa");
        myList2.stream()
                .filter(s-> !set.add(s))
                .forEach(System.out::println);
     //   Given the list of integers, find the first element of the list using Stream functions?
        List<Integer> myList3 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);


        List<Integer> max= Arrays.asList(10,20,30,40,50,60);
       long count1 = max.stream()
                .count();
        System.out.println("cout of the list "+count1
        );

     int maximum=   max.stream()
                .max(Integer::compare)
                .get();
        System.out.println("maximum number in List"+maximum);
    }



}
