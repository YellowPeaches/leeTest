package com.company.normal;

import java.util.ArrayList;
import java.util.List;

public class _1006 {
    public static void main(String[] args) {
        System.out.println(new Solution().clumsy(0));
    }
    static class Solution {
        public int clumsy(int N) {
            if (N == 1) {
                return 1;
            } else if (N == 2) {
                return 2;
            } else if (N == 3) {
                return 6;
            } else if (N == 0) {
                return 0;
            }
            List<Integer> tempList = new ArrayList<>();
            int x = N % 4;
            for (int i = N; i > x; i -= 4) {
                int temp = 0;
                if (i != N) {
                    temp = i * (i - 1) / (i - 2) - (i - 3);
                } else
                    temp = i * (i - 1) / (i - 2) + (i - 3);
                tempList.add(temp);
            }
//            System.out.println(tempList);
            int ans = tempList.get(0);
            for (int i = 1; i < tempList.size(); i++) {
                ans -= tempList.get(i);
            }
            if (x == 1) {
                ans--;
            } else if (x == 2) {
                ans -= 2;
            } else if (x == 3) {
                ans -= 6;
            }

            return ans;
        }
    }

}

