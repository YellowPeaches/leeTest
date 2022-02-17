package com.company.test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccuracyChecker {
    public static void main(String[] args) throws IOException {
        long lasting = System.currentTimeMillis();
        Map<String, String> skuMap = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("D:\\aaaimage\\database.txt")), "UTF-8"));//构造一个BufferedReader类来读取文件
            String s = null;
            while ((s = br.readLine()) != null) {//使用readLine方法，一次读一行
                int begin = s.indexOf("0");
                skuMap.put(s.substring(begin, begin + 6), s.substring(0, begin - 1));
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<String> xmlPath = readfile("D:\\serverDetection\\xml_done");
        new File("D:\\aaaimage\\ans.txt").delete();
        double rightResult = 0;
        for (int i = 0; i < xmlPath.size(); i++) {
            String ans = readFile(xmlPath.get(i));
            String[] split = ans.split(",");
            String name = "";
            for (int j = 0; j < split.length; j++) {
                name += skuMap.get(split[j]) + " ";
            }
            System.out.println(name + "  " + xmlPath.get(i));
            writeResult("D:\\aaaimage\\ans.txt", name + "\n");
            if (ans.contains("021734")) {
                rightResult++;
            }
        }
        System.out.println((rightResult / xmlPath.size()) * 100 + "%");
        System.out.print("耗时(ms): ");
        System.out.println(System.currentTimeMillis() - lasting);
    }

    //获取路径下所有文件
    public static List<String> readfile(String filepath) throws FileNotFoundException, IOException {
        List<String> path = new ArrayList<>();
        try {

            File file = new File(filepath);
            if (!file.isDirectory()) {
//                System.out.println("文件");
//                System.out.println("path=" + file.getPath());
//                System.out.println("absolutepath=" + file.getAbsolutePath());
//                System.out.println("name=" + file.getName());

            } else if (file.isDirectory()) {
                //System.out.println("文件夹");
                String[] filelist = file.list();
                for (int i = 0; i < filelist.length; i++) {
                    File readfile = new File(filepath + "\\" + filelist[i]);
                    if (!readfile.isDirectory()) {
                        path.add(readfile.getPath());
                        // System.out.println("path=" + readfile.getPath());
                    } else if (readfile.isDirectory()) {
                        readfile(filepath + "\\" + filelist[i]);
                    }
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("readfile()   Exception:" + e.getMessage());
        }
        return path;
    }

    // 读取文件result内容
    public static String readFile(String path) {
        File file = new File(path);
        //StringBuilder result = new StringBuilder();
        String result = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));//构造一个BufferedReader类来读取文件

            String s = null;
            while ((s = br.readLine()) != null) {//使用readLine方法，一次读一行
                if (s.contains("result")) {
                    int begin = s.indexOf("<res") + 8;
                    int end = s.indexOf("</re");
                    // System.out.println(s.substring(begin, end));
                    //System.out.println(s);
                    result = s.substring(begin, end);
                    break;
                }
                // result.append(System.lineSeparator() + s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //return result.toString();
        return result;
    }

    public static void writeResult(String fileName, String content) {
        try {
            // 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
