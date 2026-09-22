/*
 * Problem: Count Words in a String Using a Separator
 *
 * Given a string where words are separated by '#',
 * count the number of words present in it.
 *
 * Approach:
 * Split the string using '#' as the delimiter
 * and count the resulting elements.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Note:
 * This approach assumes words are separated by '#'.
 */

import java.util.*;

class WordsInStringSep {

    public static int count(String s) {

        String a[] = s.split("#");

        return a.length;
    }

    public static void main(String args[]) {

        String s = "Sri#vasavi#engineering#college";

        System.out.println(
            WordsInStringSep.count(s)
        );
    }
}
