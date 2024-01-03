package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonRepeating {
    public static void main(String[] args) {
        String str = "Java Hungry Blog Alive is Awesome";

        String str2 = "teeter";

        char[] ch2 = str2.toCharArray();


        for (char ch : str2.toCharArray()) {
            if (str2.indexOf(ch) == str2.lastIndexOf(ch)) {
                System.out.println("repeted String is " + ch);
                break;
            }

        }

        Map<String, Long> ch = str.codePoints().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(ch);

        List<String> map2 = ch.entrySet()
                .stream()
                .filter(ent -> ent.getValue() > 1)
                .map(ent -> ent.getKey())
                .collect(Collectors.toList());

        System.out.println(map2);
    }


}
