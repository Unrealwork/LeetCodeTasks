package com.leetcode.problems.nextgreater;


public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] result = new int[findNums.length];
        for (int i = 0; i < findNums.length; i++) {
            int current = findNums[i];
            int j = findPos(nums, current) + 1;
            while (j < nums.length && nums[j] <= current) {
                j++;
            }
            result[i] = (j == nums.length) ? -1 : nums[j];
        }
        return result;
    }

    private static int findPos(int[] nums, int current) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == current) {
                return i;
            }
        }
        throw new IllegalStateException(String.format("Element %d doesn't exist", current));
    }
}
