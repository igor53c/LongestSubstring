import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static String findLongestSubstring(String string1, String string2) {
        Set<String> longestSubstrings = new HashSet<>();
        int maxLength = 0;

        for (int i = 0; i < string1.length(); i++) {
            for (int j = i + maxLength; j <= string1.length(); j++) {
                String substring = string1.substring(i, j);
                if (string2.contains(substring) && substring.length() > maxLength) {
                    longestSubstrings.clear();  // clear any shorter substrings
                    longestSubstrings.add(substring);
                    maxLength = substring.length();
                } else if (string2.contains(substring) && substring.length() == maxLength) {
                    longestSubstrings.add(substring);
                }
            }
        }

        return String.join(" ", longestSubstrings);
    }

}
