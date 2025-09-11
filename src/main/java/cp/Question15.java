package cp;

public class Question15 {
    public static void main(String[] args) {

    }
}

class Solution15 {
    public static boolean isMatch(String s, String p) {
        int lenP = p.length();
        int lenS = s.length();
        if (lenP == 0) return lenS == 0;
        if (lenS == 0) return validRemainingPattern(p.substring(0, lenP));
        if (p.charAt(lenP-1) == s.charAt(lenS-1) || p.charAt(lenP-1) == '.') {
            return isMatch(s.substring(0, lenS-1), p.substring(0, lenP-1));
        }

        if(p.charAt(lenP-1) == '*'){
            if(lenP < 2) return false;

            if(p.charAt(lenP-2) == s.charAt(lenS-1) || p.charAt(lenP-2) == '.'){
                if(isMatch(s.substring(0, lenS-1), p)) return true;
            }

            return isMatch(s, p.substring(0, lenP-2));
        }
        return false;

    }

    public static boolean validRemainingPattern(String p){
        for (int i=p.length()-1;i>-1; i--){
            if (p.charAt(i) == '*') {
                i--;
                continue;
            }
            return false;
        }
        return true;
    }
}
