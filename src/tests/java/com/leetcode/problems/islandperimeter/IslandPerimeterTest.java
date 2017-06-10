package com.leetcode.problems.islandperimeter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;


public class IslandPerimeterTest {

    @DataProvider
    private Object[][] provideIslandPerimeterData() {
        return new Object[][]{
                {
                        new int[][]{
                                {0, 1, 0, 0},
                                {1, 1, 1, 0},
                                {0, 1, 0, 0},
                                {1, 1, 0, 0}
                        },
                        16
                },
                {
                        new int[][]{
                                {1, 0}
                        },
                        4
                }
        };
    }

    @Test(dataProvider = "provideIslandPerimeterData")
    public void testIslandPerimeter(int[][] grid, int expectedPerimeter) throws Exception {
        String assertMessage = String.format(
                "Incorrect perimeter for the following grid: %n%s", Arrays.deepToString(grid)
        );
        assertEquals(IslandPerimeter.islandPerimeter(grid), expectedPerimeter, assertMessage);
    }

}