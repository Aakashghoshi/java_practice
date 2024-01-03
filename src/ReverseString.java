public class ReverseString {
    public static void main(String[] args) {
        String str = "Aakash";
        int i,c=0,res;

        char ch[] = new char[str.length()];


       for(i=0;i<str.length();i++)
           ch[i]=str.charAt(i);
        System.out.println("AAkash");

        for(i=str.length()-1;i>=0;i--)
            System.out.print(ch[i]);

    }

}
