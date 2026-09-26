import java.util.*;

class SubSequence {

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    public static boolean isSubsequence(String s1, String s2) {
        int i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s1.length();
    }

    public static void main(String[] args) {
        String s1 = "john";
        String s2 = "johanna";

        System.out.println(isSubsequence(s1, s2));
    }
}
