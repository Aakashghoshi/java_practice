package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test3 {
    public static void main(String[] args) {

        int[] arr = {1,6,7,3,2,8,1,11,50};

        Arrays.sort(arr);

        System.out.println(arr[1]);

        int sec = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.naturalOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(sec);

        String str = "ava is the language";

        Character ch = str.chars()
                .mapToObj(s-> Character.toUpperCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s->s.getValue()==1L)
                .map(s->s.getKey())
                .findFirst()
                .get();
        System.out.println(ch);

        String[] str1 = {"aakasjh","asas","aodne","ofmkdjf"};
        double [][] avg = {{12.21,12.212,12.212,12.2123,12.423},
                {12.21,12.212,12.212,12.2123,12.423},
                {12.21,12.212,12.212,12.2123,12.423},
                {12.21,12.212,12.212,12.2123,12.423}
        };

        findavgprovess(str1,avg);


    }
    public static void findavgprovess(String[] str1,double[][] avg){

        for(int i=0; i<str1.length;i++){

            System.out.println("name " +str1[i]);
            System.out.println("avg");
           double avr = calculateavarage(avg[i]);
            System.out.println(avr);
           }
        }




    public static double calculateavarage(double[] avg1){
     int sum =0;
             for(int j=0;j<avg1.length;j++){

                 sum+=avg1[j];
             }
             double avarage=0 ;
             avarage = sum/4;
            return avarage;
    }

}

