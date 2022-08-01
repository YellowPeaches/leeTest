package com.company.simple;

import java.util.ArrayList;
import java.util.List;

public class _599 {
    public static void main(String[] agrs){
        int decimal = 100;
        int octal = 0144;
        int hexa =  0x64;
        String f = Integer.toString(decimal,7);
        System.out.println(decimal);
        System.out.println(octal);
        System.out.println(hexa);
        System.out.println(f);
    }


    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if(list1[i].equals(list2[j])){
                    list.add(list1[i]);
                }
            }
        }
        String[] ans =new String[list.size()];
//        Arrays.sort();
        for (int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }

}
