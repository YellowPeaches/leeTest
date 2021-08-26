package com.company.normal;

public class _55 {
    public static void main(String[] args) {

    }

    public static boolean canJump(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return true;
        }
        int cover = 0;
        for (int i = 0; i <=cover ; i++) {
            cover=Math.max(i+nums[i],cover);
            if(cover>=len){
                return true;
            }
        }
        return false;
    }
}
