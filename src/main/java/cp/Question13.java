package cp;

public class Question13 {
    public static void main(String[] args) {
        // This is a placeholder for Question 13 implementation.
        System.out.println("Question 13 implementation goes here.");
    }
}

class  Solution13 {
    // This is a placeholder for Solution 13 implementation.
    public static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            res = res * 10 + pop;
        }
        return res;
    }

    public static int reverseCheat(int x) {
        int res = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if(res > Integer.MAX_VALUE / 10) return 0;
            int newRes = res * 10 + pop;
            if (res>0 && (newRes/Math.abs(newRes) != res/Math.abs(res))) return 0;
            res = newRes;
        }
        return res;
    }
}
