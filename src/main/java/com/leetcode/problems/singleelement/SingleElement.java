package com.leetcode.problems.singleelement;


public class SingleElement {
    private SingleElement() {

    }

    public static int singleNonDuplicate(int[] nums) {
        int l = nums.length;
        int currentMiddle = nums.length / 2;
        int currentValue = nums[currentMiddle];
        int right = 0;
        int left = l - 1;
        while (currentMiddle > 0 && currentMiddle < l) {
            currentMiddle = left + (right - left) / 2;
            currentValue = nums[currentMiddle];
            if (currentValue != nums[currentMiddle - 1] && currentValue != nums[currentMiddle + 1]) {
                return currentValue;
            }
            int next = ((left - right) % 2 == 0) ? +1 : -1;
            if (currentValue == nums[currentMiddle + next]) {
                right = currentMiddle;
            } else {
                left = currentMiddle;
            }
        }
        return currentValue;
    }

}
