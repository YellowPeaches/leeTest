package com.company.test;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int temp;
        double sum=0;
        int l=0;
        while (true){
            temp=sc.nextInt();
            if(temp<=0){
                break;
            }
            sum+=temp;
            l++;
        }
        System.out.println(l);
        System.out.println(sum/l);

    }
}
