package com.company.simple;

import java.util.Arrays;

public class _976 {
    public static void main(String[] args) {
        int a[] = {2, 2, 1};
        new Solution().largestPerimeter(a);
    }

    static class Solution {
        public int largestPerimeter(int[] A) {
            int ans = 0;
            Arrays.sort(A);
            int len = A.length;
            for (int i = len - 1; i >= 2; i--) {
                if (A[i] < A[i - 1] + A[i - 2]) {
                    ans = A[i] + A[i - 1] + A[i - 2];
                    break;
                }
            }
            System.out.println(A[len - 1]);
            System.out.println(ans);
            return ans;
        }
    }
}
