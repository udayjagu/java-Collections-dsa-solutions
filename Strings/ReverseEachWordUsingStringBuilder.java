/*
 * Problem: Reverse Each Word in a String
 *
 * Given a string, reverse each individual word
 * while keeping the word order unchanged.
 *
 * Approach:
 * Split the string using a space as the delimiter.
 * For each word, use StringBuilder's reverse() method
 * to reverse its characters and print the result.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Note:
 * This approach assumes words are separated by single spaces.
 */

import java.util.*;

class ReverseEachWordUsingStringBuilder {

    public static void rev(String s) {

        String a[] = s.split(" ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(
                new StringBuilder(a[i]).reverse() + " "
            );
        }
    }

    public static void main(String args[]) {

        String s = "Sri vasavi engineering college";

        ReverseEachWordUsingStringBuilder.rev(s);
    }
}
