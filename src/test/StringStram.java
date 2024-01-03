package test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Pattern;

public class StringStram {

    public static void main(String[] args) {

        String str5 = "teeter";

        HashMap<Character,Integer> map = new LinkedHashMap<>();

        char[] char2 = str5.toCharArray();
        int lengh = char2.length;
Character ch;
        for(int i=0; i<lengh;i++){

            ch = str5.charAt(i);
            if(map.containsKey(ch)){

                map.put(ch, map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }


        }

     //   for ((Map.Entry)map)



        String str = "aakashsingh";

        StringBuilder stew = new StringBuilder();
        stew.append(str);
        stew.reverse();
        System.out.println(stew);

//        char[] ch = str.toCharArray();
//        int left;
//        int right = ch.length-1;
//
//        for(left=0;right>left; right--,left++){
//            char ch1 = ch[right];
//            ch[right] = ch[left];
//            ch[left] = ch1;
//        }


//        for(char ch3: ch){
//            System.out.print(ch3);
//        }
//
//
//
//
//        String str3 = "asdsa/asf/afs/fasf";
//        String delimiter = ".";
//        Optional<String> result = Pattern.compile("/")
//                .splitAsStream(str)
//                .filter(s -> ! s.isEmpty())
//                .reduce((s, s2) -> String.join(delimiter, s2, s));
//      // System.out.println(result);
    }
}
