package collection;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapLoopExample
{
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("Key1","value1");
        hashMap.put("Key2","value2");
        hashMap.put("Key3","value3");
        System.out.print("\nKeys: ");

        System.out.println("Aakash Singh");
        for(String key: hashMap.values()) {
            System.out.print(key);
            System.out.print(", ");
        }


        Set<String> set = hashMap.keySet();

        TreeMap<String,String> treeMap = new TreeMap<>(hashMap);

        set.stream().forEach(System.out::println);
        Set<String> tree = treeMap.keySet();

        tree.stream().forEach(System.out::println);


    }
}
