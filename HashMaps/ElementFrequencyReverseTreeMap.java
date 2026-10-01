/*
Problem: Count Frequency of Array Elements in Reverse Order using TreeMap

Description:
Count the frequency of each element in an integer array
using a TreeMap and display the elements along with their
frequencies in descending order.

Approach:
- Create a TreeMap where the array element is the key
  and its frequency is the value.
- Use Collections.reverseOrder() to maintain the keys
  in descending order.
- Traverse the array and update the frequency of each element.
- Use getOrDefault() to handle new and existing elements.
- Traverse the entrySet() to display each element and its frequency.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

import java.util.*;

public class ElementFrequencyReverseTreeMap {

    public static void main(String[] args) {

        int[] arr = {6, 5, 7, 6, 9, 11, 8, 10, 56, 56};

        System.out.println("Array: " + Arrays.toString(arr));

        TreeMap<Integer, Integer> frequencyMap =
                new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            frequencyMap.put(
                arr[i],
                frequencyMap.getOrDefault(arr[i], 0) + 1
            );
        }

        System.out.println("Element\tFrequency");

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(
                entry.getKey() + "\t" + entry.getValue()
            );
        }
    }
}
