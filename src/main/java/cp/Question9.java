package cp;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        Solution9 sol = new Solution9();
        int result = sol.lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}

class Solution9 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int[] index = new int[128]; // ASCII character set
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
