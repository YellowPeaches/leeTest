package com.company.test;

import java.io.*;
import java.util.StringTokenizer;

public class huashang {
    public static String srcPath = "D:\\";
    public static String srcFileName = "AiEleScaleComData.txt";
    public static String dstPath = "D:\\";
    public static String dstFileName = "data.txt";

    public static void main(String[] args) {
        try {
            // 读
            FileInputStream fileInputStream = new FileInputStream(srcPath + srcFileName);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "GB2312"));
            String line = null;
            StringTokenizer pas = null;
            File file = new File(dstPath + dstFileName);
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            Writer writer = new OutputStreamWriter(new FileOutputStream(file), "GB2312");
            while ((line = bufferedReader.readLine()) != null) {
                pas = new StringTokenizer(line, " ");
                line = "";
                while (pas.hasMoreTokens()) {
                    String s = pas.nextToken();
                    line += s + ",";
                }
                System.out.println(line);
                writer.write(line + "\r\n");
            }

            writer.close();
            fileInputStream.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
