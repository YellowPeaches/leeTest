package com.company.simple;

public class _204 {
    public static void main(String[] args) {

        System.out.println(new Solution().countPrimes(23));
    }

    static class Solution {
        public int countPrimes(int n) {
            if (n == 0 || n == 1) {
                return 0;
            }
            int N = n;
            int su[] = new int[N + 1];
            boolean isprime[] = new boolean[N + 1];
            int cnt = 1;
            for (int i = 2; i <= N; i++) {
                if (!isprime[i]) {
                    su[cnt++] = i;
                }
                for (int j = 1; j <= cnt && su[j] * i < N; j++) {
                    isprime[su[j] * i] = true;   //筛掉小于等于i的素数和i的积构成的合数
                }

            }
//            for(int i=1;i<cnt-1;i++) {
//                System.out.println(su[i]);
//            }

            return cnt - 2;
        }
    }
}
