public class PalindromeString {

    public static void main(String[] args) {
        String str = "asksa";
      // String str1 = "Aakash";

        char[] ch = str.toCharArray();




        StringBuffer str1 = new StringBuffer(str);
        System.out.println("Aakash:  "+str1);
        str1 = str1.reverse();
      //  str1 = "Aakash";
        System.out.println("Singh:  "+str1);

        boolean flag = str.equals(str1);
        System.out.println(flag);
        if(str1.equals(str)){
            System.out.println("String is palindrom");
        }
        else {
            System.out.println("String is not palindrom");
        }

    }

}
