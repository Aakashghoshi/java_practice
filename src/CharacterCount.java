import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String inputString = "Java is a widely used programming language. Java is versatile and has a large community.";
        String[] str3 = inputString.toLowerCase().split(" ");
        System.out.println(str3.length);

        Map<Character, Integer> characterCountMap = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            if (characterCountMap.containsKey(c)) {
                characterCountMap.put(c, characterCountMap.get(c) + 1);
            } else {
                characterCountMap.put(c, 1);
            }
        }

        // Displaying character counts
        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }

    }
}
