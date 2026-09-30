/*
Problem: Count Frequency of Array Elements using LinkedHashMap

Description:
Count the frequency of each element in an integer array
using a LinkedHashMap and display the elements along with
their frequencies.

Approach:
- Create a LinkedHashMap where the array element is the key
  and its frequency is the value.
- Traverse the array.
- If the element already exists, increase its frequency.
- Otherwise, add the element with frequency 1.
- LinkedHashMap maintains the order of first occurrence
  of the elements.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

public class ElementFrequencyLinkedHashMap {

    public static void main(String[] args) {

        int[] arr = {6, 5, 7, 6, 9, 11, 8, 10, 56, 56};

        LinkedHashMap<Integer, Integer> frequencyMap = new LinkedHashMap<>();

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
