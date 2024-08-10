public class FirstNonRepeatedCharFirst {
    public static void main(String[] args) {
        String inputStr ="ttetea";

        System.out.println("Aakash");
        System.out.println("Aakash");

        for(char i :inputStr.toCharArray()){
            if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
                System.out.println("First non-repeating character is: "+i);
                break;
            }
        }
    }
}
