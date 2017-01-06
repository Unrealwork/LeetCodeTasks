package com.leetcode.problems.fizzbuzz;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class FizzBuzzTest {

    @DataProvider(name = "fizzBuzzDataProvider")
    private Object[][] provideFizzBuzzData() {
        return new Object[][]{
                {3, Arrays.asList("1", "2", "Fizz")},
                {15, Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
                        "14", "FizzBuzz")
                }
        };
    }

    @Test(dataProvider = "fizzBuzzDataProvider")
    public void testFizzBuzz(int n, List<String> expectedResult) throws Exception {
        String assertMessage = String.format("Incorrect result for %d", n);
        assertEquals(FizzBuzz.fizzBuzz(n), expectedResult, assertMessage);
    }

}