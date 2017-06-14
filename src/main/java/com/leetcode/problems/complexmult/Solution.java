package com.leetcode.problems.complexmult;


public class Solution {

    static class Complex {
        private double real;
        private double imaginary;

        Complex(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        private static Complex fromString(String s) {
            String[] splitted = s.split("\\+");
            double real = Double.parseDouble(splitted[0]);
            double im = Double.parseDouble(splitted[1].replace("i", ""));
            return new Complex(real, im);
        }

        public Complex mul(Complex other) {
            double real = this.real * other.real - this.imaginary * other.imaginary;
            double imaginary = this.real * other.imaginary + this.imaginary * other.real;
            return new Complex(real, imaginary);
        }

        @Override
        public String toString() {
            return String.format("%.0f+%.0fi", real, imaginary);
        }
    }

    public static String complexNumberMultiply(String a, String b) {
        return Complex.fromString(a).mul(Complex.fromString(b)).toString();
    }

    public static void main(String[] args) {
        System.out.println(complexNumberMultiply("1+-1i", "1+-1i"));
    }
}
