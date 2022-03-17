package com.company.normal;
import java.util.*;

public class _2055 {
    public static void main(String[] args) {
//        int[][] queries = {{2, 5}, {5, 9}};
//        String s = "**|**|*********||||||******|";
//        int ans[] = platesBetweenCandles(s, queries);
//        for (int i = 0; i < ans.length; i++) {
//            System.out.println(ans[i]);
//        }
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            StringBuilder sb =new StringBuilder();
            //10->2
            if(s.contains(".")){
                String[] temp = s.split("\\.");
                for(int i=0;i<temp.length;i++){
                    int a=Integer.parseInt(temp[i]);
                    String num =Integer.toBinaryString(a);
                    while(num.length()<8){
                        num="0"+ num;
                    }
                    sb.append(num);
                }
                System.out.println(Long.parseLong(sb.toString(), 2));
            }else{
                String num2 = Long.toBinaryString(Long.parseLong(s));
                while(num2.length()<32){
                    num2="0"+num2;
                }
                String[] ss =new String[4];
                for(int i=0;i<4;i++){
                    ss[i]=Integer.toString(Integer.parseInt(num2.substring(8*i, 8*i+8), 2));
                }
                System.out.println(ss[0]+"."+ss[1]+"."+ss[2]+"."+ss[3]);
            }
        }
    }

    public static int[] platesBetweenCandles(String s, int[][] queries) {
        int len = queries.length;
        char[] s1 = s.toCharArray();
        int[] ans = new int[len];
        int[] firstLeft = new int[s.length()];
        int[] firstRight = new int[s.length()];
        int[] preSum = new int[s.length()];
        int temp = -1;
        for (int i = 0; i < s.length(); ++i) {
            if ('|' == s1[i]) {
                temp = i;
                firstLeft[i] = i;
            } else {
                firstLeft[i] = temp;
            }
            if (i != 0) {
                if ('*' == s1[i]) {
                    preSum[i] = preSum[i - 1] + 1;
                } else {
                    preSum[i] = preSum[i - 1];
                }
            }
        }
        temp = -1;
        for (int i = s.length() - 1; i >= 0; --i) {
            if ('|' == s1[i]) {
                temp = i;
            }
            firstRight[i] = temp;
        }
        for (int i = 0; i < len; i++) {
            int left = firstRight[queries[i][0]];
            // 得到右侧最近的蜡烛下标
            int right = firstLeft[queries[i][1]];
            // 处理特殊情况
            if (left == -1 || right == -1 || left > right) {
                ans[i] = 0;
            } else {
                // 前缀和相减
                ans[i] = preSum[right] - preSum[left];

            }
        }
        return ans;
    }
}
