package com;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String s = in.nextLine();

            while (s.contains("(")) {
                s = removeOne(s);
                int p = s.lastIndexOf(")");
                if (s.lastIndexOf(")") == s.length()) {
                    System.out.println(s);
                    break;
                }
                if (s.equals("error")) {
                    System.out.println(s);
                    break;
                }
            }


//             System.out.println(s);
//             System.out.println(aa);
        }
    }

    public static String removeOne(String s) {
        int index = s.lastIndexOf("(");
        int index2 = s.indexOf(")");
        String ss = s.substring(index + 1, index2);
        String one = tempAns(ss);
        if (one.equals("error")) {
            return "error";
        }
        return s.substring(0, index) + one + s.substring(index2 + 1);
    }

    public static String tempAns(String cur) {
        String[] cmd = cur.split(" ");
        int a = Integer.parseInt(cmd[1]);
        int b = Integer.parseInt(cmd[2]);
        if (cmd[0].equals("add")) {
            return a + b + "";
        }
        if (cmd[0].equals("sub")) {
            return a - b + "";
        }
        if (cmd[0].equals("mul")) {
            return a * b + "";
        }
        if (cmd[0].equals("div")) {
            if (b == 0) {
                return "error";
            } else {
                return a / b + "";
            }
        }
        return "error";
    }
}