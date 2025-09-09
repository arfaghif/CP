package cp;

public class Question14 {
    public static void main(String[] args) {
        // This is a placeholder for Question 14 implementation.
        System.out.println("Question 14 implementation goes here.");
    }
}

class  Solution14 {
    public static int myAtoi(String s) {
        // This is a placeholder for Solution 14 implementation.
        if (s.isEmpty()) return 0;
        // find sign first
        int i = 0;
        boolean isFirst = true;
        int res=0;
        int sign = 1;
        for (;i < s.length(); i++) {
            char c = s.charAt(i);
            if (isFirst){
                if (c == '+' || c == '-') {
                    sign = getSign(c);
                    isFirst = false;
                    continue;
                }
                else if (c == ' '){
                    while(i < s.length() && s.charAt(i) == ' ') i++;
                    if (i == s.length()){
                        return 0;
                    }
                    i--;
                    continue;
                }
                else{
                    isFirst = false;
                }
            }
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                int pop = s.charAt(i) - '0';
                if (sign*res > Integer.MAX_VALUE / 10 || (sign*res == Integer.MAX_VALUE / 10 && pop > 7)) return Integer.MAX_VALUE;
                if (sign*res < Integer.MIN_VALUE / 10 || (sign*res == Integer.MIN_VALUE / 10 && pop > 8)) return Integer.MIN_VALUE;
                res = res*10 + pop;
            } else {
                return sign*res;
            }
        }
        return sign*res;
    }

    public static int getSign(char c) {
        if (c == '-') {
            return -1;
        } else {
            return 1;
        }
    }

    // This is a placeholder for Solution 14 implementation.
}
