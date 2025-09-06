
package cp;

import java.util.Scanner;
import java.util.Stack;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter postfix expression: ");
        String expr = sc.nextLine();
        int result = Solution5.evaluatePostfix(expr);
        System.out.println("Result: " + result);
    }
}

class Solution5 {
    public static int evaluatePostfix(String expr) {
        Stack<Integer> stack = new Stack<>();
        for (char c : expr.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (c) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }
}
