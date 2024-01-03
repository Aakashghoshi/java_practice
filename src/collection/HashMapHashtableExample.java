package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashMapHashtableExample {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("Aakash","ghoshi");
        hashtable.put("Arvind","Chandel");
        hashtable.put("Helmala","Thakur");
        hashtable.put("Vandana","ghoshi");
        hashtable.put("sarita","chandel");
        System.out.println(hashtable);

        Map<String,String> map = new TreeMap<>(hashtable);
//        map.put("Aakash","ghoshi");
//        map.put("Arvind","Chandel");
//        map.put("Helmala","Thakur");
//        map.put("Vandana","ghoshi");
//        map.put("sarita","chandel");
        System.out.println(map);
    }
}
