package com.company.simple;

import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;

public class _661  {
    public static void main(String[] args) throws Exception {
        int i=0;
        Boolean Ba =false;
        while (!Ba){
            if(i==100){
                Ba=true;
            }
//            System.out.println(i++);
            long start =System.currentTimeMillis();
            boolean hostReachable = isHostReachable();
//            boolean hostReachable = testWsdlConnection();
            System.out.println(System.currentTimeMillis()-start);
            System.out.println(hostReachable);
        }

    }
    public static boolean isHostReachable() {
        String host="114.115.174.123";
        Integer timeOut=1000;
        try {
            return InetAddress.getByName(host).isReachable(timeOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean testWsdlConnection() throws Exception {
        String address="https://www.baidu.com/";
        int status = 404;
        try {
            URL urlObj = new URL(address);
            HttpURLConnection oc = (HttpURLConnection) urlObj.openConnection();
            oc.setUseCaches(false);
            oc.setConnectTimeout(1000); // 设置超时时间
            status = oc.getResponseCode();// 请求状态
            if (200 == status) {
                // 200是请求地址顺利连通。。
                return true;
            }else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }
//    public static int[][] imageSmoother(int[][] img) {
//        int row = img.length;
//        int len = img[0].length;
//        int[][] ans = new int[row][len];
//        for (int i = 0; i < row; i++) {
//            int sum = 0;
//            int count = 0;
//            for (int j = 0; j < len; j++) {
//                if (i == 0 && j == 0) {
//                    count = 4;
//                    sum = img[i][j] + img[i + 1][j] + img[i][j + 1] + img[i + 1][j + 1];
//                    ans[i][j] = sum / count;
//                } else if (i == 0 && j == len) {
//                    count = 4;
//                    sum = img[i][j] + img[i + 1][j] + img[i][j - 1] + img[i + 1][j - 1];
//                    ans[i][j] = sum / count;
//                } else if (i == row - 1 && j == 0) {
//                    count = 4;
//                    sum = img[i][j] + img[i - 1][j] + img[i][j + 1] + img[i - 1][j + 1];
//                    ans[i][j] = sum / count;
//                } else if (i == row - 1 && j == len - 1) {
//                    count = 4;
//                    sum = img[i][j] + img[i][j - 1] + img[i][j - 1] + img[i - 1][j - 1];
//                    ans[i][j] = sum / count;
//                } else if (i == 0) {
//                    count = 6;
//                    sum = img[i][j] + img[i][j - 1] + img[i][j + 1] + img[i + 1][j - 1] + img[i + 1][j] + img[i + 1][j + 1];
//                    ans[i][j] = sum / count;
//                } else if (i == row - 1) {
//                    count = 6;
//                    sum = img[i][j] + img[i][j - 1] + img[i][j + 1] + img[i - 1][j - 1] + img[i - 1][j] + img[i - 1][j + 1];
//                    ans[i][j] = sum / count;
//                } else if (j == 0) {
//                    count = 6;
//                    sum = img[i][j] + img[i - 1][j] + img[i + 1][j] + img[i - 1][j + 1] + img[i + 1][j] + img[i + 1][j + 1];
//                    ans[i][j] = sum / count;
//                } else if (j == len - 1) {
//                    count = 6;
//                    sum = img[i][j] + img[i - 1][j] + img[i + 1][j] + img[i - 1][j - 1] + img[i][j - 1] + img[i - 1][j + 1];
//                    ans[i][j] = sum / count;
//                } else {
//                    count = 9;
//                    sum = img[i][j] + img[i][j - 1] + img[i][j + 1] + img[i - 1][j - 1] + img[i - 1][j] + img[i - 1][j + 1] + img[i + 1][j - 1] + img[i + 1][j] + img[i + 1][j + 1];
//                    ans[i][j] = sum / count;
//                }
//
//            }
//            return ans;
//        }
//    }
}

