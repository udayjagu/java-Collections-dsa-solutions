/*
 * Problem: Two Sum
 *
 * Given an integer array and a target value,
 * check whether there exist two elements whose sum
 * is equal to the target.
 *
 * Approach: Sorting + Two Pointers
 * First sort the array.
 * Use two pointers:
 * - Left pointer starts from the beginning.
 * - Right pointer starts from the end.
 *
 * If the sum is smaller than the target, move left forward.
 * If the sum is greater than the target, move right backward.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 *
 * Note:
 * Arrays.sort() modifies the original array.
 */

import java.util.*;

class TwoSumUsingSort {

    public static boolean is2Sum(int arr[], int target) {

        Arrays.sort(arr);

        int l = 0, r = arr.length - 1;

        while (l < r) {

            if (arr[l] + arr[r] == target)
                return true;

            else if (arr[l] + arr[r] < target)
                l++;

            else
                r--;
        }

        return false;
    }

    public static void main(String args[]) {

        int a[] = {10, 8, -7, 6, -9, 3, 4, 19, 2};

        System.out.println(
            TwoSumUsingSort.is2Sum(a, 12)
        );
    }
}
