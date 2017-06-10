package com.leetcode.problems.nextgreater;

import java.util.Arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NextGreaterElementTest {
    @DataProvider
    private Object[][] provideNextGreaterElementData() {
        return new Object[][] {
            {
                new int[] {},
                new int[] {},
                new int[] {}
            },
            {
                new int[] {2, 4},
                new int[] {1, 2, 3, 4},
                new int[] {3, -1}
            },
            {
                new int[] {4, 1, 2},
                new int[] {1, 3, 4, 2},
                new int[] {-1, 3, -1}
            }

        };
    }

    @Test(dataProvider = "provideNextGreaterElementData")
    public void testNextGreaterElement(int[] findNums, int[] nums, int[] expectedResult)
        throws Exception {
        final int[] actualResult = NextGreaterElement.nextGreaterElement(findNums, nums);
        String assertMessage = String.format("Incorrect result for following inputs %s, %s.%n" +
                "Expected: %s%nActual: %s",
            Arrays.toString(findNums), Arrays.toString(nums), Arrays.toString(expectedResult),
            Arrays.toString(actualResult)
        );
        assertEquals(actualResult, expectedResult, assertMessage);
    }

}