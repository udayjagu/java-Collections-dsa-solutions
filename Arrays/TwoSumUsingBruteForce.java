/*
 * Problem: Two Sum on unsorted Array
 *
 * Given an integer array and a target value,
 * check whether there exist two elements whose sum
 * is equal to the target.
 *
 * Approach: Brute Force
 * Check every possible pair using two nested loops.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

import java.util.*;

class TwoSumUsingBruteForce {

    public static boolean is2Sum(int arr[], int target) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target)
                    return true;
            }
        }

        return false;
    }

    public static void main(String args[]) {

        int a[] = {10, 8, -7, 6, -9, 3, 4, 19, 2};

        System.out.println(
            TwoSumUsingBruteForce.is2Sum(a, 11)
        );
    }
}
```
