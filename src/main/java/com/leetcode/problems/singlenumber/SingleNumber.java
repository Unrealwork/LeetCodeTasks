package com.leetcode.problems.singlenumber;

/**
 * @see<a href="https://leetcode.com/problems/single-number/">Single Number</a>
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
