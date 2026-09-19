/*
 * Problem: Two Sum in a Sorted Array
 *
 * Given a sorted integer array and a target value,
 * check whether there exist two elements whose sum
 * is equal to the target.
 *
 * Approach: HashSet
 * Store previously visited elements in a HashSet.
 * For each element, calculate the required complement
 * and check whether it already exists in the set.
 *
 * Note:
 * The array is sorted, but this HashSet approach
 * does not use the sorted property.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

class TwoSumUsingHashSetSorted {

    public static boolean is2Sum(int arr[], int target) {

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            int res = target - arr[i];

            if (hs.contains(res))
                return true;

            hs.add(arr[i]);
        }

        return false;
    }

    public static void main(String args[]) {

        int a[] = {1, 2, 3, 4, 5, 6, 8, 9, 12};

        System.out.println(
            TwoSumUsingHashSetSorted.is2Sum(a, 10)
        );
    }
}
