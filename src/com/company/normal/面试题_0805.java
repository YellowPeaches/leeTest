package com.company.normal;

public class 面试题_0805 {

    public static void main(String[] args) {
        System.out.println(multiply(4, 9));
    }

    public static int multiply(int A, int B) {
        if (A == 0 || B == 0) {
            return 0;
        }
        if (B == 1) {
            return A;
        }
        if (B < 0) {
            B = -B;
            return -helper(A, B);
        }
        return helper(A, B);
    }

    private static int helper(int m, int n) {
        if (n == 1) {
            return m;
        }
        if (n % 2 == 0) {
            int half = helper(m, n / 2);
            return half + half;
        } else {
            int half = helper(m, n / 2);
            return half + half + m;
        }
    }

}


