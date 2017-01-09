package com.leetcode.problems.largestpalindrome;

//TODO: decrease  execution time
public class LargestPalindrome {
    private static final int MODULO = 1337;

    private static long reverseNumber(long n) {
        long reverse = 0;
        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }
        return reverse;
    }

    static int largestPalindrome(int digitsAmount) {
        for (int palindromesSize = digitsAmount * 2; palindromesSize >= (digitsAmount - 1) * 2 + 1; palindromesSize--) {
            int halfSize = palindromesSize / 2;
            long startHalf = (long) Math.pow(10, halfSize - 1);
            long endHalf = startHalf * 10 - 1;
            long multiplier = (palindromesSize % 2 == 0) ? startHalf * 10 : startHalf * 100;
            if (palindromesSize % 2 == 0) {
                for (long i = endHalf; i >= startHalf; i--) {
                    long reverseHalf = reverseNumber(i);
                    long palindrome = i * multiplier + reverseHalf;
                    if (isAppropriatePalindrome(palindrome, digitsAmount)) {
                        return (int) (palindrome % MODULO);
                    }
                }
            } else {
                if (startHalf > 0) {
                    for (long i = startHalf; i <= endHalf; i++) {
                        long reverseHalf = reverseNumber(i);
                        for (int j = 0; j < 10; j++) {
                            long palindrome = i * multiplier + j * startHalf * 10 + reverseHalf;
                            if (isAppropriatePalindrome(palindrome, digitsAmount)) {
                                return (int) (palindrome % MODULO);
                            }
                        }
                    }
                } else {
                    for (int j = 9; j >= 0; j++) {
                        if (isAppropriatePalindrome(j, digitsAmount)) {
                            return j % MODULO;
                        }
                    }
                }

            }
        }
        return 0;
    }

    static boolean isAppropriatePalindrome(long palindrome, int n) {
        int start = (int) Math.pow(10, n - 1);
        int end = start * 10 - 1;
        for (int i = end; i >= start; i--) {
            if (palindrome % i == 0) {
                int secondMultiplier = (int) (palindrome / i);
                if (secondMultiplier / start >= 1 && secondMultiplier / start <= 9) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        largestPalindrome(8);
    }
}