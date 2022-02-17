package com.company.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class txt2excel {

    public static void main(String[] args) {
        String filepath = "D:\\20201218.txt";
        readTxtFile(filepath);
    }

    public static void readTxtFile(String filePath) {
        try {
            sku s = new sku();
            List<sku> list = new LinkedList<>();
            String encoding = "UTF-8";
            File file = new File(filePath);
            if (file.isFile() && file.exists()) { //判断文件是否存在
                InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    String[] temp = lineTxt.split(",");
                    s.wBiaoShi = temp[0];
                    s.inputKey = temp[1];
                    s.name = temp[2];
                    s.price = Double.valueOf(temp[3]) / 100;
                    s._key = temp[4];
                    s.badTime = temp[5];
                    s.storeId = temp[6];
                    s.biaoShi1 = temp[7];
                    s.biaoShi2 = temp[8];
                    list.add(s);
                    //System.out.println(s.price);
                }
                System.out.println(list.size());
                read.close();
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }

    }
}

class sku {
    String wBiaoShi;
    String inputKey;
    String name;
    double price;
    String _key;
    String badTime;
    String storeId;
    String biaoShi1;
    String biaoShi2;
}