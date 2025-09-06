
package cp;

import java.util.HashSet;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Integer duplicate = Solution3.findDuplicate(arr);
        if (duplicate != null) {
            System.out.println("Duplicate found: " + duplicate);
        } else {
            System.out.println("No duplicates found.");
        }
    }
}

class Solution3 {
    public static Integer findDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                return num;
            }
        }
        return null;
    }
}
 