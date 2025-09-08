package cp;

public class Question11 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

class Solution11 {
    // Add your solution methods here
    public static String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j < s.length()-i +1; j++) {
                String sub = s.substring(j, j+i);
                if (isPalindrome(sub)) {
                    return sub;
                }
            }

        }
        return "";
    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) return true;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String longestPalindrome2(String s) {
        if (s == null || s.isEmpty()) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);     // Odd length
            int len2 = expandAroundCenter(s, i, i + 1); // Even length
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }


}
