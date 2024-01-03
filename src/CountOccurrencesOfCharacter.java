public class CountOccurrencesOfCharacter {
    public static void main(String args[]) {
        // Given String
        String inputString = "LoveYourself";
        // Character to be searched, here 'o'
        char searchChar = 'o';
        int count = 0;
        for(int i=0; i < inputString.length(); i++)
        {
            if(inputString.charAt(i) == searchChar) {
                count++;
            }
        }
        System.out.println("Character "+searchChar+" appears in the inputString "+count+" times");
    }
}
