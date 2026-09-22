/*
 * Problem: Reverse a String Using Two Pointers
 *
 * Given a string, reverse all the characters in the string.
 *
 * Approach:
 * Convert the string into a character array.
 * Use two pointers, one starting from the beginning
 * and the other from the end.
 * Swap the characters at both pointers and move them
 * towards the center.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Note:
 * A character array is used because String objects
 * are immutable in Java.
 */

import java.util.*;

class ReverseStringUsingTwoPointers {

    public static String rev(String s) {

        char s1[] = s.toCharArray();

        int l = 0, r = s.length() - 1;

        while (l < r) {

            char tmp = s1[l];
            s1[l] = s1[r];
            s1[r] = tmp;

            l++;
            r--;
        }

        return String.valueOf(s1);
    }

    public static void main(String args[]) {

        String s = "Uday";

        System.out.println(
            ReverseStringUsingTwoPointers.rev(s)
        );
    }
}
