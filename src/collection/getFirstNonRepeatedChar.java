package collection;
import java.util.*;


public class getFirstNonRepeatedChar {
    public static void main(String[] args) {
        Character ch = getFirstNonRepeatedChar("teaterj");
        Character ch1 = getFirstNonRepeatedChar("teaterj");
        Character ch2 = getFirstNonRepeatedChar("teaterj");

        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(ch2);
    }

    public static char getFirstNonRepeatedChar(String str) {
        Map<Character, Integer> counts = new LinkedHashMap<>();


        for (char c : str.toCharArray()) {
            if (counts.containsKey(c)) {
                counts.put(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);
            }


        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        throw new RuntimeException("didn't find any non repeated Character");
    }

    public static char firstNonRepeatingChar(String word) {
        Set<Character> repeating = new HashSet<>();
        List<Character> nonRepeating = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (repeating.contains(letter)) {
                continue;
            }
            if (nonRepeating.contains(letter)) {
                nonRepeating.remove((Character) letter);
                repeating.add(letter);
            } else {
                nonRepeating.add(letter);
            }
        }
        return nonRepeating.get(0);
    }

    public static char firstNonRepeatedCharacter(String word) {
        HashMap<Character, Integer> scoreboard = new HashMap<>(); // build table [char -> count]

         for (int i = 0; i < word.length(); i++)
         {
             char c = word.charAt(i);
             if (scoreboard.containsKey(c))
             {
                 scoreboard.put(c, scoreboard.get(c) + 1); }
             else {
                 scoreboard.put(c, 1);
             }
         } // since HashMap doesn't maintain order, going through string again
         for (int i = 0; i < word.length(); i++)
         { char c = word.charAt(i);
             if (scoreboard.get(c) == 1)
             {
                 return c;
             }
         }
         throw new RuntimeException("Undefined behaviour"); }





}
