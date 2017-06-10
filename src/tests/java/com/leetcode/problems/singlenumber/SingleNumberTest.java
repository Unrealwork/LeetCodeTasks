package com.leetcode.problems.singlenumber;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;


public class SingleNumberTest {
    @DataProvider
    private Object[][] provideSingleNumberData() {
        return new Object[][]{
                {
                        new int[]{1, 3, 2, 2, 4, 1, 3},
                        4
                }
        };
    }

    @Test(dataProvider = "provideSingleNumberData")
    public void testSingleNumber(int[] nums, int expectedSingleNumber) throws Exception {
        String assertMessage = String.format(
                "Incorrect once met number for array %s",
                Arrays.toString(nums)
        );
        assertEquals(SingleNumber.singleNumber(nums), expectedSingleNumber, assertMessage);
    }

}