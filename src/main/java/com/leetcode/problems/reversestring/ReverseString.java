package com.leetcode.problems.reversestring;


public class ReverseString {
    public static String reverseString(String s) {
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
