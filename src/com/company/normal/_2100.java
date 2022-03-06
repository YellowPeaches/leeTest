package com.company.normal;

import java.util.LinkedList;
import java.util.List;

public class _2100 {
    public static void main(String[] args) {
        int[] s = {5, 3, 3, 3, 5, 6, 9};
        System.out.println(goodDaysToRobBank2(s, 2));
    }

    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> ans = new LinkedList<>();
        for (int i = time; i < security.length - time; i++) {
            int tempMin = security[i];
            int tempMax = security[i];
            int temp = 0;
            for (int j = 0; j <= time; j++) {
                if (tempMin <= security[i - j] && tempMax <= security[i + j]) {
                    tempMax = security[i + j];
                    tempMin = security[i - j];
                    temp++;
                } else {
                    break;
                }
            }
            if (temp == time + 1) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static List<Integer> goodDaysToRobBank2(int[] security, int time) {
        List<Integer> ans = new LinkedList<>();
        int len = security.length;
        int[] left = new int[len];
        int[] right = new int[len];
        for (int i = 1; i < len; i++) {
            if (security[i] <= security[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
            if (security[len - 1 - i] <= security[len - i]) {
                right[len - 1 - i] = right[len - i] + 1;
            }
        }
        for (int i = time; i < len - time; i++) {
            if (left[i] >= time && right[i] >= time) {
                ans.add(i);
            }
        }
        return ans;
    }
}
