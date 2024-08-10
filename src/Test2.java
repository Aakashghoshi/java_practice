import java.util.LinkedHashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        int i;
       String str = "Welcome to EY";
       for(i=0;i<str.length();i++){
           System.out.println(str.length());
       }


       String str1 ="Aakash";

        Map<Character, Integer> map2 = new LinkedHashMap<>();

        for (Character ch = str1.toCharArray()){
            if (map2.containsKey(ch)){
                map2.put(ch,map2.get(ch)+1);
            }
            else {

            }
        }


    }
}
