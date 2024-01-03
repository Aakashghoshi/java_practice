package Testing2;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Testing2 {

    public static void main(String[] args) {
        System.out.println("aakash");
        System.out.println("Singh");
        System.out.println("Chandel");

        String str ="AABBCCD";

        Map<String,Long> map = str.codePoints().mapToObj(Character::toString).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
