package java8.stream;
import java.util.*;
import java.util.stream.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstnonrepeatedJava8 {
    public static void main(String args[]) {
        String input = "Java Hungry Blog Alive is Awesome";

        Map<Character, Long> cha =  input.chars()
                .mapToObj(s->Character.toUpperCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Aakasj"+cha);

        Map<Character, Long> ch1 =  input.codePoints()
                    .mapToObj(s->Character.toUpperCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println("Aakasj"+ch1);

        Character ch2 =  input.codePoints()
                .mapToObj(s->Character.toUpperCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s->s.getValue()==1)
                .map(s->s.getKey())
                .findFirst().get();

        System.out.println(ch2);


        Character result = input.chars() // Stream of String
                .mapToObj(s ->Character.valueOf((char) s)) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);

        List<Integer> li = Arrays.asList(1,2,3,3,44,44,5,67,6);


    }
}


