/*
 * Problem: Two Sum in a Sorted Array
 *
 * Given a sorted integer array and a target value,
 * check whether there exist two elements whose sum
 * is equal to the target.
 *
 * Approach: Brute Force
 * Check every possible pair using two nested loops.
 * The array is sorted, but the brute-force approach
 * does not use the sorted property.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

import java.util.*;

class TwoSumUsingBruteForceSortedArray {

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

        int a[] = {1, 2, 3, 4, 5, 6, 7, 9};

        System.out.println(
            TwoSumUsingBruteForceSortedArray.is2Sum(a, 9)
        );
    }
}