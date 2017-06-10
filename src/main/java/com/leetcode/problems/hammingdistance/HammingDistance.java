package com.leetcode.problems.hammingdistance;

public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int value = x ^ y;
        int result = 0;
        while (value != 0) {
            if ((value & 1) > 0) {
                result++;
            }
            value = value >>> 1;
        }
        return result;
    }
}