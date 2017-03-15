package com.leetcode.problems.singleelement;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SingleElementTest {
    @Test(dataProvider = "provideData")
    public void testSingleNonDuplicate(int[] nums, int expectedValue) throws Exception {
        assertEquals(SingleElement.singleNonDuplicate(nums), expectedValue);
    }

    @DataProvider
    private Object[][] provideData() {
        return new Object[][]{
//                {new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}, 2},
//                {new int[]{3, 3, 7, 7, 10, 11, 11}, 10},
//                {new int[]{1}, 1},
                {new int[]{1, 1, 3, 3, 4, 4, 8, 8, 10}, 10},
                {new int[]{1, 1, 2}, 2}
        };
    }
}