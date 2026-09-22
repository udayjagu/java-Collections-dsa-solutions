/*
 * Problem: Reverse a String
 *
 * Given a string, reverse all the characters in the string.
 *
 * Approach:
 * Create a StringBuilder with the given string
 * and use the reverse() method to reverse the characters.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Note:
 * The complete string is reversed, including spaces.
 */

import java.util.*;

class RevOfLine {

    public static String rev(String s) {

        StringBuilder sb = new StringBuilder(s);

        sb.reverse();

        return String.valueOf(sb);
    }

    public static void main(String args[]) {

        String s = "Sri vasavi engineering college";

        System.out.println(
            RevOfLine.rev(s)
        );
    }
}
