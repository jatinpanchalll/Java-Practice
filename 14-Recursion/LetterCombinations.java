import java.util.*;

public class LetterCombinations {

    static String[] map = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
    };

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0)
            return ans;

        solve(digits, 0, "", ans);
        return ans;
    }

    static void solve(String digits, int index, String current, List<String> ans) {

        if (index == digits.length()) {
            ans.add(current);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            solve(digits, index + 1, current + letters.charAt(i), ans);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}