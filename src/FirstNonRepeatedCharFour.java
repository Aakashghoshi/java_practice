import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharFour {
    public static void main(String[] args) {
        String str = "teetertteerak";

        Map<Character,Integer> map = new LinkedHashMap();
        for (Character ch : str.toCharArray()) {
            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
        }
       char ch= map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
        System.out.println(map);
        System.out.println(ch);
    }
}

