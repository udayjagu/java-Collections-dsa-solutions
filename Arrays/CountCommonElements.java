import java.util.*;

class Interjection {

    /*
     * Time Complexity: O(n + m)
     * Space Complexity: O(max(n, m))
     */

    public static int countCommonElements(int[] arr1, int[] arr2) {
        int count = 0;

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        if (arr1.length > arr2.length) {

            for (int i = 0; i < arr1.length; i++) {
                frequencyMap.put(
                    arr1[i],
                    frequencyMap.getOrDefault(arr1[i], 0) + 1
                );
            }

            for (int j = 0; j < arr2.length; j++) {
                frequencyMap.put(
                    arr2[j],
                    frequencyMap.getOrDefault(arr2[j], 0) - 1
                );
            }

        } else {

            for (int i = 0; i < arr2.length; i++) {
                frequencyMap.put(
                    arr2[i],
                    frequencyMap.getOrDefault(arr2[i], 0) + 1
                );
            }

            for (int j = 0; j < arr1.length; j++) {
                frequencyMap.put(
                    arr1[j],
                    frequencyMap.getOrDefault(arr1[j], 0) - 1
                );
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr1 = {2, 4, 6, 8, 10, 11};
        int[] arr2 = {2, 8, 11, 13, 99, 105, 110};

        System.out.println(countCommonElements(arr1, arr2));
    }
}
