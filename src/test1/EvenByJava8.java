package test1;


//
//find out all the even numbers that exist in the list using Stream functions

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//2,4,2,5,7,4,5
public class EvenByJava8 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,4,2,5,7,4,5);

        String [] str1 = {"Aakash","Anush","akshat"};

        Stream st = Arrays.stream(str1);
        System.out.println("converted String into Stream");
        st.forEach(System.out::println);


        Set<Integer> set = list.stream().filter(e->e%2==0).collect(Collectors.toSet());
        System.out.println(set);

    }
}
