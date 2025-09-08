package cp;

public class Question12 {
    public static void main(String[] args) {
    }
}

class Solution12 {
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder firstString = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2 * (numRows - 1)) {
            firstString.append(s.charAt(i));
        }
        for (int i = 1; i < numRows-1; i++) {
            String oddString = "";
            for (int j = i; j < s.length(); j += 2* (numRows-1)) {
                oddString += s.charAt(j);
            }
            String evenString = "";
            for (int j = 2* (numRows-1) - i; j < s.length(); j += 2* (numRows-1)) {
                evenString += s.charAt(j);
            }

            for (int j = 0; j < evenString.length(); j++) {
                firstString.append(oddString.charAt(j));
                firstString.append(evenString.charAt(j));
            }
            if (oddString.length() > evenString.length()) {
                firstString.append(oddString.charAt(oddString.length() - 1));
            }
        }
        for (int i = numRows-1; i < s.length(); i += 2 * (numRows - 1)) {
            firstString.append(s.charAt(i));
        }

        return firstString.toString();
    }

    public static String convert2(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();

        int currRow = 0;
        boolean goingDown = false;
        for (char c : s.toCharArray()) {
            rows[currRow].append(c);
            if (currRow == 0 || currRow == numRows - 1) goingDown = !goingDown;
            currRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) result.append(row);
        return result.toString();
    }
}