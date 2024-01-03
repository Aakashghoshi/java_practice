package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import java.util.stream.Collectors;

public class SortMapByValuesProgram {
    public static void main(String[] args) {

        String Str = "Aakash Singh";
         String [] ch2 = Str.split(" ");


        Map<Character, Integer> map3 = new HashMap<>();

//        for(char ch : ch2){
//
//            if(map3.containsKey(ch)){
//
//                map3.put(ch,map3.get(ch)+1);
//            }
//            else {
//                map3.put(ch,1);
//            }
//        }

        System.out.println(map3);









        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(111,"aakash");
        hashMap.put(222,"singh");
        hashMap.put(333,"chandel");
        hashMap.put(444,"raj");
        hashMap.put(555,"akshat");
        hashMap.put(666,"thakur");

           Map<Integer,String>  sortedMaop = hashMap.entrySet()
                    .stream()
                    .sorted(Entry.comparingByValue())
                    .collect(Collectors.toMap(Entry::getKey,Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
            System.out.println("Sorted map by their values"+sortedMaop);

        Map<Integer,String> map_rev = hashMap.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Entry.comparingByValue()))
                .collect(Collectors.toMap(Entry::getKey,Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

        System.out.println("Sorted value in reverse order"+map_rev);

        Map<Integer,String> lensoted = hashMap.entrySet()
                .stream()
               // .sorted(Entry.comparingByValue((o1,o2)->o1.length() - o2.length()))
                //OR
                .sorted(Collections.reverseOrder(Entry.comparingByValue((o1, o2) -> o1.length() - o2.length())))
                .collect(Collectors.toMap(Entry::getKey,Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        System.out.println(lensoted);
    }
}
