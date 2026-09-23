/*
Problem: Sum of Two Squares

Description:
Check whether a given number can be represented as the sum
of squares of two positive integers.

Approach:
Use two pointers:
- l starts from 1.
- r starts from sqrt(n).
- If l² + r² == n, return true.
- If the sum is greater than n, decrease r.
- If the sum is smaller than n, increase l.

Time Complexity: O(sqrt(n))
Space Complexity: O(1)
*/

import java.util.*;

class SumOfSquares {

    public static boolean is2Sum(int n) {
        int l = 1;
        int r = (int) Math.sqrt(n);

        while (l < r) {
            int res = l * l + r * r;

            if (res == n)
                return true;
            else if (res > n)
                r--;
            else
                l++;
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 25;

        System.out.println(is2Sum(n));
    }
}
