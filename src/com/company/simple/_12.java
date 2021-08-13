package com.company.simple;

import java.util.ArrayList;
import java.util.List;

public class _12 {
    public static void main(String[] args) {
        String s = intToRoman(3210);
        System.out.println(s);
        String str="/9KgFNLnjp1OR1biYRAny0s0uFjySgmJiUttPykYJwhBjBOQoPNcw0UcshmlXzXihWRDITIu5vOVg8blo5EIVf3citHxnbkmiisZfDT85K/hS9f1MV4kkA3r0cONpKYaNElT7hXhXhiIX7uECkFSQceYCTCuMhyQ3YkB/nrDfvuzqp6LTv8Aojir2eaR7id5HaWO9+yo7HJSBgWKIPuphmJR1AeM4KMu1ccjqX+jwfaISUnnYCScEmYh4bp3C2";
        System.out.println(str.length());
    }

    public static String intToRoman(int num) {
        String[] ge = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] shi = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] bai = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        List<String> list = new ArrayList<>();
        int q = num / 1000;
        while (q-- > 0) {
            list.add("M");
        }
        num %= 1000;
        if (num / 100 > 0) {
            list.add(bai[num / 100]);
        }
        num %= 100;
        if (num / 10 > 0) {
            list.add(shi[num / 10]);
        }
        num %= 10;
        list.add(ge[num]);
        String ans= list.toString().replace(", ","");
        return ans.substring(1,ans.length()-1).trim();
    }
}

//1994
//        输出: "MCMXCIV"
/*
*
*
*
* 字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。

通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：

I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
*/