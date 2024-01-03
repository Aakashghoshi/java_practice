package collection;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
///5*4*3*2*1

        int val =5;
        int sum=1;
        for(int i=val;i>=1;i--){
            sum = sum*i;

        }

        System.out.println(sum);



        String s1 = "hello world";
        String s2 = "hello world";
        String s3 = new String("hello world");
        System.out.println(s1 == s2); // true
        //System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true






















//        List<String> items = Arrays.asList("java is a programming language and java is a programming based language");
//
//        String str1 = items.get(0);
//        String[]  str2 = str1.split(" ");
//
//
//
//        Map<String,Long> map1  = Arrays.stream(str2).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(map1);
//
//
//        LinkedHashMap map2= new LinkedHashMap<>(map1);
//        System.out.println(map2);
//
//     String str = map1.entrySet()
//                .stream()
//                .filter(s -> s.getValue()==1)
//                .map(s -> s.getKey())
//                .findFirst()
//                .get();
//
//
//        System.out.println(str);
    }

}
