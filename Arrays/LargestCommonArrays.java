import java.util.*;

class LargestCommonArrays {

    public static int findLargestCommonElement(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int l = arr1.length - 1;
        int r = arr2.length - 1;

        while (l >= 0 && r >= 0) {
            if (arr1[l] == arr2[r]) {
                return arr1[l];
            } else if (arr1[l] < arr2[r]) {
                r--;
            } else {
                l--;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 4, 2, 99, 8, 111};
        int[] arr2 = {110, 13, 11, 8, 99, 105, 2};

        System.out.println(
            findLargestCommonElement(arr1, arr2)
        );
    }
}