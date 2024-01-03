public class reverseString2 {
    public static void main(String[] args) {
        String input = "Be in present";
        char[] temparray= input.toCharArray();
        int left,right=0;
        right=temparray.length-1;
        for (left=0; left < right ; left++ ,right--)
        {
            // Swap values of left and right
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right]=temp;
        }
        for (char c : temparray)
            System.out.print(c);
        System.out.println();
        String str1 = "abc";

        String str2 = new String("abc");

        System.out.println(str1 == str2); //false

        System.out.println(str1.equals(str2)); //true
    }
}
