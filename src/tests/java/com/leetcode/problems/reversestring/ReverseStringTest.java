package com.leetcode.problems.reversestring;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class ReverseStringTest {
    @DataProvider
    private Object[][] provideReversedString() {
        return new Object[][]{
                {"abcd", "dcba"}
        };
    }

    @Test(dataProvider = "provideReversedString")
    public void testReverseString(String sourceString, String expectedString) throws Exception {
        String assertMessage = String.format(
                "Incorrect reverse string for string %s",
                sourceString
        );
        assertEquals(ReverseString.reverseString(sourceString), expectedString, assertMessage);
    }

}