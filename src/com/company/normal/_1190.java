package com.company.normal;

import java.util.Stack;

public class _1190 {
    public static void main(String[] args) {
        String s = reverseParentheses("((u(love)i))");
        System.out.println(s);
    }

    public static String reverseParentheses(String s) {
        //int a=Math.uniform(101);
        Stack<String> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(sb.toString());
                sb.setLength(0);
            } else if (s.charAt(i) == ')') {
                sb.reverse();
                sb.insert(0, stack.pop());
            } else {
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }
}
