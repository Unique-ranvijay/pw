import java.util.HashMap;

public class Unique {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Build the frequency map of characters in the string
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Iterate through the string and find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // If no non-repeating character is found
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int index = firstUniqChar(s);
        System.out.println("First unique character index: " + index);
    }
}

