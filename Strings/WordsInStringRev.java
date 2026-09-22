/*
 * Problem: Reverse Words in a String
 *
 * Given a string, print the words in reverse order.
 *
 * Approach:
 * Split the string using a space as the delimiter
 * and traverse the resulting array from the last word
 * to the first word.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Note:
 * This approach assumes words are separated by single spaces.
 */

import java.util.*;

class WordsInStringRev {

    public static void rev(String s) {

        String a[] = s.split(" ");

        for (int i = a.length - 1; i >= 0; i--)
            System.out.print(a[i] + " ");
    }

    public static void main(String args[]) {

        String s = "Sri vasavi engineering college";

        WordsInStringRev.rev(s);
    }
}
