public class WordCount {
    public static void main(String[] args) {



        String inputString = "Aava is a programming language with JVM";

        // Removing leading and trailing whitespaces
        inputString = inputString.trim();

        // Splitting the string into words
        String[] words = inputString.split(" ");

        // Counting the number of words
        int wordCount = words.length;

        System.out.println("Number of words: " + wordCount);


    }
}
