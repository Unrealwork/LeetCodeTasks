package com.leetcode.problems.disappearednumbers;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class DisappearedNumbersTest {
    @DataProvider
    private Object[][] provideDisappearedNumbersData() {
        return new Object[][]{
                {
                        new int[]{4, 3, 2, 7, 8, 2, 3, 1},
                        Arrays.asList(5, 6)
                }
        };
    }

    @Test(dataProvider = "provideDisappearedNumbersData")
    public void testFindDisappearedNumbers(int[] nums, List<Integer> expectedList) throws Exception {
        String assertMessage = String.format(
                "Incorrect disappeared values for %s",
                Arrays.toString(nums)
        );
        assertEquals(DisappearedNumbers.findDisappearedNumbers(nums), expectedList, assertMessage);
    }

}