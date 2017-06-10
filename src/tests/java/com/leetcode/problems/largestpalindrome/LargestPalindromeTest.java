package com.leetcode.problems.largestpalindrome;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LargestPalindromeTest {
    @DataProvider
    private Object[][] provideAppropriatePalindromeData() {
        return new Object[][]{
                {9009L, 2, true},
                {9119, 2, false},
                {9999999999L, 5, false}
        };
    }

    @Test(dataProvider = "provideAppropriatePalindromeData")
    public void testIsAppropriatePalindrome(long palindrome, int digitAmount, boolean expectedValue) throws Exception {
        assertEquals(LargestPalindrome.isAppropriatePalindrome(palindrome, digitAmount), expectedValue);
    }

    @DataProvider
    private Object[][] provideIsPalindromeData() {
        return new Object[][]{
                {9009, true}
        };
    }

    @Test
    public void testIsPalindrome() throws Exception {

    }

    @DataProvider
    private Object[][] provideLargestPalindromeData() {
        return new Object[][]{
                {1, 9},
                {2, 987},
                {3, 123},
                {5, 677}
        };
    }

    @Test(dataProvider = "provideLargestPalindromeData")
    public void testLargestPalindrome(int digitsAmount, int expectedResult) throws Exception {
        String assertMessage = String.format(
                "Incorrect largest palindrome for %d-digit numbers",
                digitsAmount
        );
        assertEquals(LargestPalindrome.largestPalindrome(digitsAmount), expectedResult, assertMessage);
    }

}