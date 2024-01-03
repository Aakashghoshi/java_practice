import java.io.BufferedReader;
import java.io.InputStreamReader;

public class reverse {
    public static void main(String[] args) {
        String inputStr ="teeter";

        for(char i :inputStr.toCharArray()){
            if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
                System.out.println("First non-repeating character is: "+i);
                break;
            }
        }
    }

}
