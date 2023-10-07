package com.company.test;

public class sortTest {

    public static void main(String[] args) {
        int[] a={87,212,3,44,55,33,6,6,9};
        int[] b =popSort(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }


    public static int[] popSort(int [] nums){
        int len =nums.length;
        for (int i = len; i >0; i--) {
            for (int j = 1; j < i; j++) {
                if(nums[j]<nums[j-1]){
                    int temp =nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
        return nums;
    }
}
