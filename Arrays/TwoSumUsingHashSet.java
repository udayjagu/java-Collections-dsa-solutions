/*
 * Problem: Two Sum
 *
 * Given an integer array and a target value,
 * check whether there exist two elements whose sum
 * is equal to the target.
 *
 * Approach: HashSet
 * Store previously visited elements in a HashSet.
 * For each element, calculate the required complement
 * and check whether it already exists in the set.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

class TwoSumUsingHashSet {

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

        int a[] = {10, 8, -7, 6, -9, 3, 4, 19, 222};

        System.out.println(
            TwoSumUsingHashSet.is2Sum(a, 16)
        );
    }
}
