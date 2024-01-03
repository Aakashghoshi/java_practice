package collection;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testing {
    public static void main(String[] args) {
        String str = "helloworld";

        List list= Arrays.asList(str.toCharArray());

        List<String> listOfString =  Arrays.asList("Aakash","Singh","Aakash","Singh","Thakur");

       Map<String,Long> aa =  listOfString.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(aa);
        Map list1 = new TreeMap(aa);
        System.out.println(list1);
        char [] ch = str.toCharArray();

        HashMap<Character,Integer> hashMap = new HashMap<>();

        for (Character ch1 : str.toCharArray()){

            if(hashMap.containsKey(ch1)){
                hashMap.put(ch1,hashMap.get(ch1)+1);
            }else{
                hashMap.put(ch1,1);
            }

        }

        System.out.println(hashMap);
        Map treemap = new TreeMap(hashMap);
        System.out.println(treemap);





    }
}
