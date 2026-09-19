/*
 * Problem: Two Sum in a Sorted Array
 *
 * Given a sorted integer array and a target value,
 * check whether there exist two elements whose sum
 * is equal to the target.
 *
 * Approach: Two Pointers
 * Use two pointers:
 * - Left pointer starts from the beginning.
 * - Right pointer starts from the end.
 *
 * If the sum is equal to the target, return true.
 * If the sum is smaller than the target, move the left pointer forward.
 * If the sum is greater than the target, move the right pointer backward.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Note:
 * The input array must already be sorted.
 */

import java.util.*;

class TwoSumUsingSorted {

    public static boolean is2Sum(int arr[], int target) {

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {

            int sum = arr[l] + arr[r];

            if (sum == target)
                return true;

            else if (sum < target)
                l++;

            else
                r--;
        }

        return false;
    }

    public static void main(String args[]) {

        int a[] = {1, 2, 3, 4, 5, 7, 8, 9, 10};

        System.out.println(
            TwoSumUsingSorted.is2Sum(a, 12)
        );
    }
}
