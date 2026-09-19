/*
 * Problem: Count Words in a String
 *
 * Given a string, count the number of words present in it.
 *
 * Approach:
 * Split the string using a space as the delimiter
 * and count the resulting elements.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Note:
 * This approach assumes words are separated by single spaces.
 */

import java.util.*;

class WordsInString {

    public static int count(String s) {

        String a[] = s.split(" ");

        return a.length;
    }

    public static void main(String args[]) {

        String s = "Sri vasavi engineering college";

        System.out.println(
            WordsInString.count(s)
        );
    }
}
