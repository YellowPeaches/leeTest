package com.company.normal;

public class _454 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
            int ans=0;
            int la=A.length;
            int lb=B.length;
            int lc=C.length;
            int ld=D.length;
            for (int i = 0; i < la; i++) {
                for (int j = 0; j < lb; j++) {
                    for (int k = 0; k < lc; k++) {
                        for (int l = 0; l < ld; l++) {
                            if(A[i]+B[j]+C[k]+D[l]==0){
                                ans++;
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }
}
