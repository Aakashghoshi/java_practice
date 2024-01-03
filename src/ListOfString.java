import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListOfString {
    public static void main(String[] args) {
String str =  "string data to count each character";

        List<String> listOfStr = new ArrayList<>();
        listOfStr.add("aakash");
        listOfStr.add("aakash");
        listOfStr.add("singh");
        listOfStr.add("deeepak");



        Map<String,Long> map = str.codePoints().mapToObj(Character::toString)
                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

        List<String> names = Arrays.asList("AA", "BB", "AA", "CC","CC","AA","AA", "BB", "AA", "CC","CC","AA");
        Map<String,Long> namesCount = names
                .stream()
                .filter(x-> Collections.frequency(names, x)>1)
                .collect(Collectors.groupingBy
                        (Function.identity(), Collectors.counting()));
        System.out.println(namesCount);

    }
}
