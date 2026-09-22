/*
 * Problem: Print Words in a String
 *
 * Given a string, print each word present in it.
 *
 * Approach:
 * Split the string using a space as the delimiter
 * and print each resulting word.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Note:
 * This approach assumes words are separated by single spaces.
 */

import java.util.*;

class WordsInStringPrint {

    public static void count(String s) {

        String a[] = s.split(" ");

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    public static void main(String args[]) {

        String s = "Sri vasavi engineering college";

        WordsInStringPrint.count(s);
    }
}
