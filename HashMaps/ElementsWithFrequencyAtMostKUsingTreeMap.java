/*
 * Problem: Elements With Frequency At Most K
 *
 * Given n integers, count the frequency of each element
 * and print the elements whose frequency is less than
 * or equal to k.
 *
 * Approach:
 * Use a TreeMap to store each element and its frequency.
 * The TreeMap is created with reverse order so that
 * elements are stored in descending order.
 *
 * Steps:
 * 1. Read n elements.
 * 2. Store each element and its frequency using TreeMap.
 * 3. Read the value of k.
 * 4. Traverse the TreeMap entries.
 * 5. Print elements whose frequency is less than or equal to k.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 *
 * Note:
 * TreeMap keeps the elements sorted in descending order
 * because Collections.reverseOrder() is used.
 */

import java.util.*;

public class ElementsWithFrequencyAtMostKUsingTreeMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<Integer, Integer> hm =
                new TreeMap<>(Collections.reverseOrder());

        int n = sc.nextInt();

        for (int j = 0; j < n; j++) {

            int x = sc.nextInt();

            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        System.out.println("Enter the k value : ");

        int k = sc.nextInt();

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {

            if (entry.getValue() <= k)
                System.out.print(entry.getKey() + " ");
        }
    }
}