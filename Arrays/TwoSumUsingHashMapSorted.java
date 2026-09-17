/*
 * Problem: Two Sum in a Sorted Array
 *
 * Given a sorted integer array and a target value,
 * check whether there exist two elements whose sum
 * is equal to the target.
 *
 * Approach: HashMap
 * Store previously visited elements in a HashMap.
 * For each element, calculate the required complement
 * and check whether it already exists in the map.
 *
 * Note:
 * The array is sorted, but this HashMap approach
 * does not use the sorted property.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

class TwoSumUsingHashMapSorted {

    public static boolean is2Sum(int arr[], int target) {

        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int res = target - arr[i];

            if (hs.containsKey(res))
                return true;

            hs.put(arr[i], i);
        }

        return false;
    }

    public static void main(String args[]) {

        int a[] = {1, 2, 3, 5, 7, 9, 13, 14, 16};

        System.out.println(
            TwoSumUsingHashMapSorted.is2Sum(a, 17)
        );
    }
}
