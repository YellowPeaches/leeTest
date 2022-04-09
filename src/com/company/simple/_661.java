package com.company.simple;

public class _661  {
    public static void main(String[] args) {

    }
    public static int[][] imageSmoother(int[][] img) {
        int row = img.length;
        int len =img[0].length;
        int[][] ans =new int[row][len];
        for (int i = 0; i < row; i++) {
            int sum=0;
            int count =0;
            for (int j = 0; j < len; j++) {
                if(i==0&&j==0){
                   count=4;
                   sum=img[i][j]+img[i+1][j]+img[i][j+1]+img[i+1][j+1];
                   ans[i][j]=sum/count;
                }
                else if(i==0&&j==len){
                    count=4;
                    sum=img[i][j]+img[i+1][j]+img[i][j-1]+img[i+1][j-1];
                    ans[i][j]=sum/count;
                }
                else if(i==row-1&&j==0){
                    count=4;
                    sum=img[i][j]+img[i-1][j]+img[i][j+1]+img[i-1][j+1];
                    ans[i][j]=sum/count;
                }
                else if(i==row-1&&j==len-1){
                    count=4;
                    sum=img[i][j]+img[i][j-1]+img[i][j-1]+img[i-1[j-1];
                    ans[i][j]=sum/count;
                }else if(i==0){
                    count=6;
                    sum=img[i][j]+img[i][j-1]+img[i][j+1]+img[i+1][j-1]+img[i+1][j]+img[i+1][j+1];
                    ans[i][j]=sum/count;
                }else if(i==row-1){
                    count=6;
                    sum=img[i][j]+img[i][j-1]+img[i][j+1]+img[i-1][j-1]+img[i-1][j]+img[i-1][j+1];
                    ans[i][j]=sum/count;
                }else if(j==0){
                    count=6;
                    sum=img[i][j]+img[i-1][j]+img[i+1][j]+img[i-1][j+1]+img[i+1][j]+img[i+1][j+1];
                    ans[i][j]=sum/count;
                }else if(j==len-1){
                    count=6;
                    sum=img[i][j]+img[i-1][j]+img[i+1][j]+img[i-1][j-1]+img[i][j-1]+img[i-1][j+1];
                    ans[i][j]=sum/count;
                }else {
                    count=9;
                    sum=img[i][j]+img[i][j-1]+img[i][j+1]+img[i-1][j-1]+img[i-1][j]+img[i-1][j+1]+img[i+1][j-1]+img[i+1][j]+img[i+1][j+1];
                    ans[i][j]=sum/count;
                }

            }
            return ans;
        }
    }
}

