import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {

        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> map = new HashMap<>();

        // Store frequency of characters in t
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;

        int required = map.size();
        int formed = 0;

        Map<Character, Integer> window = new HashMap<>();

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (map.containsKey(c) &&
                window.get(c).intValue() == map.get(c).intValue()) {
                formed++;
            }

            while (left <= right && formed == required) {

                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char ch = s.charAt(left);
                window.put(ch, window.get(ch) - 1);

                if (map.containsKey(ch) &&
                    window.get(ch) < map.get(ch)) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return minLength == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLength);
    }

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println("Result: " + minWindow(s, t));
    }
}