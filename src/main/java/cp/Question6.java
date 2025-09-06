


package cp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        int[] result = Solution6.processQueue(queue);
        System.out.println("Queue in FIFO order:");
        for (int x : result) {
            System.out.println(x);
        }
    }
}

class Solution6 {
    public static int[] processQueue(Queue<Integer> queue) {
        int[] arr = new int[queue.size()];
        int i = 0;
        while (!queue.isEmpty()) {
            arr[i++] = queue.poll();
        }
        return arr;
    }
}
