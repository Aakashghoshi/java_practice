package java8;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {

    public static int findLongestSubstringLength(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int i = 0, j = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (charIndexMap.containsKey(currentChar)) {
                j = Math.max(j, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, i);
            maxLength = Math.max(maxLength, i - j + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int length = findLongestSubstringLength(input);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}
