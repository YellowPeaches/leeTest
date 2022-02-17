package com.company.simple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _888 {
    public static void main(String[] args) {
        int[] A = {1, 2, 5};
        int[] B = {2, 4};
        int a[] = fairCandySwap2(A, B);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }

    public static int[] fairCandySwap(int[] A, int[] B) {
        int la = A.length;
        int lb = B.length;
        int flag = 1;
        int ans[] = new int[2];
        for (int i = 0; i < la; i++) {
            for (int j = 0; j < lb; j++) {
                int ta[] = A.clone();
                int tb[] = B.clone();
                ta[i] = B[j];
                tb[j] = A[i];
                if (Arrays.stream(ta).sum() == Arrays.stream(tb).sum()) {
                    ans[0] = A[i];
                    ans[1] = B[j];
                    flag = 0;
                    break;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        return ans;

    }

    public static int[] fairCandySwap2(int[] A, int[] B) {
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int delta = (sumA - sumB) / 2;
        Set<Integer> rec = new HashSet<Integer>();
        for (int num : A) {
            rec.add(num);
        }
        int[] ans = new int[2];
        for (int y : B) {
            int x = y + delta;
            if (rec.contains(x)) {
                ans[0] = x;
                ans[1] = y;
                break;
            }
        }
        return ans;
    }
}
