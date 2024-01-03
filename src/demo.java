import java.util.HashMap;

public class demo {
    public static void main(String[] args) {
        String str = "aakash singh gahoshi";
        char [] ch = str.toCharArray();
        int count=0;
        for (char ch1 : ch){
            System.out.println(ch1);
            if(ch1 == 'a'){
                count++;
            }
        }
        System.out.println(count);


        HashMap<Character, Integer> stringMap = new HashMap<>();

        for(int i=0;i<ch.length;i++){
            char ch2 =  str.charAt(i);


        }


    }

}

