package cp;

import java.util.ArrayList;

public class Question8 {
    public static void main(String[] args) {
        System.out.println("Add Two Numbers represented by linked lists");
        int result = Solution8.addTwoNumbers(
            new ListNode(2, new ListNode(4, new ListNode(3))),
            new ListNode(5, new ListNode(6, new ListNode(4)))
        ).val; // Example output);
        System.out.println(result);
    }
}

class Solution8 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int l1Val, l2Val;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            l1Val = l1 != null ? l1.val : 0;
            l2Val = l2 != null ? l2.val : 0;
            int sum = l1Val + l2Val + carry;
            arr.add(sum % 10);
            carry = sum / 10;
            l1 = l1 != null? l1.next: l1;
            l2 = l2 != null? l2.next: l2;
        }

        ListNode head = null;
        for (int i = arr.size() -1 ; i != -1; i--) {
            head = new ListNode(arr.get(i), head);
        }
        return head;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

