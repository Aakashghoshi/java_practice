import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testing12 {
    public static void main(String[] args) {
        String Str= "welcome to EY";

        String [] aa= {"aa","aa","aj","ak","at","at"};

        Map<String,Long> aj = Arrays.stream(aa).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(aj);

        char[] str2 = Str.toCharArray();

        Map<String, Long> map = Str.chars().mapToObj(Character::toString).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);
        
        Map<Character,Integer> mapInt = new HashMap<>();

        Map<String,Integer> mapInt2 = new HashMap<>();




        for (String ch1 : aa){

            if(mapInt.containsKey(ch1)){
                mapInt2.put(ch1,mapInt.get(ch1)+1);
            }
            else {
                mapInt2.put(ch1,1);
            }
        }
        System.out.println("aakash String");
        System.out.println(mapInt2);


        for (char ch : Str.toCharArray()){

            if(mapInt.containsKey(ch)){
                mapInt.put(ch,mapInt.get(ch)+1);
            }
            else {
                mapInt.put(ch,1);
            }
        }
        System.out.println(mapInt);

        Map treemap = new TreeMap(mapInt);
        System.out.println(treemap);




    }
}
