/*
 * Problem: Two Sum Using Brute Force
 *
 * Given an array and a target value, find two elements
 * whose sum is equal to the target.
 *
 * Approach:
 * Use two nested loops to check every possible pair
 * of elements in the array.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 *
 * Note:
 * This method returns the values of the two elements
 * that form the target sum.
 */

import java.util.*;

class TwoSumUsingBruteForce {

    public static int[] is2Sum(int arr[], int target) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target)
                    return new int[] {arr[i], arr[j]};
            }
        }

        return new int[] {-1, -1};
    }

    public static void main(String args[]) {

        int a[] = {10, 8, -7, 6, -9, 3, 4, 19, 2};

        System.out.println(
            Arrays.toString(
                TwoSumUsingBruteForce.is2Sum(a, 11)
            )
        );
    }
}
