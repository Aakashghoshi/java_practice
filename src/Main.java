public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");

        // Find first non-repeating character of given String

        String str = "aakashsingh"; // algorithm

        int i,j;
        char[] ch = str.toCharArray();
        System.out.println(ch);

      for(i=0;i<=str.length();i++){

          for(j=i+1;j<str.length();j++){
              if(ch[i] == ch[j]) {

              }
          }
      }
    }
}