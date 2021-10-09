package com.company.test;

import java.io.File;

public class fileClassDemo {
    /*
 - File的构造函数
 - */
    public static void main(String[] args) {
        //File(String pathname)  将指定路径名转换成一个File对象
        File file = new File("D:aaa\\1.txt");
        System.out.println(file);
        //File(String parent,String child) 根据指定的父路径和文件路径创建File对象
        File file1 =  new File("D:aaa\\a","1.txt");
        System.out.println(file1);
        //File(File parent,String child) 根据指定的父路径对象和文件路径创建File对象
        File parent = new File("D:aaa\\a");
        File file2 = new File(parent, "1.txt");
        System.out.println(file2);
        File file3 = new File(new File("D:aaa\\a"),"1.txt");
        System.out.println(file3);

    }

}
