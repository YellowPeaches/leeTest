package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String S = "###aaa##bcc#i";
        String T = "#aa#bcc#ii#";
        Solution so = new Solution();
        so.backspaceCompare(S, T);
    }
}

class Solution {
    public boolean backspaceCompare(String S, String T) {
        int sl = S.length();
        int tl = T.length();
        Deque<Character> s1 = new LinkedList<Character>();
        Deque<Character> t1 = new LinkedList<Character>();
        for (int i = 0; i < sl; i++) {
            char temp = S.charAt(i);
            if (temp != '#') {
                s1.push(temp);
            } else {
                if (!s1.isEmpty())
                    s1.pop();
            }
        }
        for (int i = 0; i < tl; i++) {
            char temp = T.charAt(i);
            if (temp != '#') {
                t1.push(temp);
            } else {
                if (!t1.isEmpty())
                    t1.pop();
            }
        }
        return t1.equals(s1);
    }
}