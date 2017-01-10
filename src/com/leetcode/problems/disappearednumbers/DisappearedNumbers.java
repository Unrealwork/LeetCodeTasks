package com.leetcode.problems.disappearednumbers;


import java.util.LinkedList;
import java.util.List;

public class DisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            swapElementInArray(nums, i);
        }
        for (int i = 0; i < nums.length; i++) {
            int number = i + 1;
            if (nums[i] != number) {
                result.add(number);
            }
        }
        return result;
    }

    private static void swapElementInArray(int[] nums, int i1) {
        int tmp;
        int i2;
        do {
            i2 = nums[i1] - 1;
            tmp = nums[i1];
            nums[i1] = nums[i2];
            nums[i2] = tmp;
        } while (nums[i1] != nums[i2]);

    }
}
