package com.company.simple;

import java.util.Arrays;
import java.util.List;

public class _412 {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
    }

    public static List<String> fizzBuzz(int n) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            if ((i+1) % 3 == 0 && (i+1) % 5 == 0) {
                answer[i]="FizzBuzz";
            } else if ((i+1) % 3 == 0) {
                answer[i]="Fizz";
            } else if ((i+1) % 5 == 0) {
                answer[i]="Buzz";
            } else {
                answer[i]=i+"";
            }
        }
        return Arrays.asList(answer.clone());
    }
}
