/*
 * Problem: Check Palindrome Using Two Pointers
 *
 * Given a string, check whether it reads the same
 * from both left to right and right to left.
 *
 * Approach:
 * Use two pointers, one starting from the beginning
 * and the other from the end.
 * Compare the characters at both pointers and move
 * them towards the center.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Note:
 * This approach is case-sensitive and considers spaces
 * and special characters.
 */

import java.util.*;

class CheckPalindromeUsingTwoPointers {

    public static boolean isPalindrome(String s) {

        int l = 0, r = s.length() - 1;

        while (l < r) {

            if (s.charAt(l) != s.charAt(r))
                return false;

            l++;
            r--;
        }

        return true;
    }

    public static void main(String args[]) {

        String s = "madam";

        System.out.println(
            CheckPalindromeUsingTwoPointers.isPalindrome(s)
        );
    }
}
