/*
Problem: Happy Number

Description:
A number is called a Happy Number if repeatedly replacing the number
with the sum of the squares of its digits eventually reaches 1.

Approach:
1. Calculate the sum of squares of the digits.
2. Use a HashSet to store previously seen numbers.
3. If the number becomes 1, it is a Happy Number.
4. If a number repeats, a cycle exists, so it is not a Happy Number.

Time Complexity: O(log n) per transformation
Space Complexity: O(log n)
*/

import java.util.*;

class HappyNumber {

    static int sumOfSquares(int n) {
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit * digit;
            n = n / 10;
        }

        return sum;
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();

        while (true) {

            if (n == 1)
                return true;

            if (hs.contains(n))
                return false;

            hs.add(n);
            n = sumOfSquares(n);
        }
    }

    public static void main(String[] args) {
        int n = 19;

        System.out.println(isHappy(n));
    }
}
