package com.leetcode.problems.fizzbuzz;

import java.util.List;


public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new java.util.LinkedList<String>();
        for (int i = 1; i <= n; i++) {
            boolean isMultipleThree = (i % 3 == 0);
            boolean isMultipleFive = (i % 5 == 0);
            String next;
            if (isMultipleThree && isMultipleFive) {
                next = "FizzBuzz";
            } else {
                if (isMultipleThree) {
                    next = "Fizz";
                } else {
                    if (isMultipleFive) {
                        next = "Buzz";
                    } else {
                        next = Integer.toString(i);
                    }
                }
            }
            result.add(next);
        }
        return result;
    }
}
