package recursion;

public class Power {
//
//    Check if the given string is a palindrome
//"Example: “racecar” "Output:  true
//    Example: “1100032”"	Output:  “false”"
//
//
    public static void main(String[] args) {
        String str = "1100032";
        //System.out.println(str);
        char [] ch = new char[str.length()];
        int j =0;
        for(int i = str.length()-1; i>=0;i--,j++){
            ch[j] = str.charAt(i);
        }
        String str2 = ch.toString();
     //  System.out.println(str2.chars());
        if(str2.equalsIgnoreCase(str)){
            System.out.println("String is palindrom");
        }
        else {
            System.out.println("String is not palindrom");
        }
 }


}