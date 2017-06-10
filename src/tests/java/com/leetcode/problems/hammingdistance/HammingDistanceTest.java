package com.leetcode.problems.hammingdistance;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class HammingDistanceTest {
    @DataProvider(name = "hammingDistanceProvider")
    private Object[][] provideHammingDistances() {
        return new Object[][]{
                {1, 4, 2},
                {4, 1, 2},
                {5, 5, 0},
                {7, 0, 3}
        };
    }


    @Test(dataProvider = "hammingDistanceProvider", timeOut = 1000L)
    public void testHammingDistance(int x, int y, int result) throws Exception {
        String assertMessage = String.format("Incorrect hamming distance between %d and %d",
                x, y
        );
        assertEquals(HammingDistance.hammingDistance(x, y), result);
    }

}