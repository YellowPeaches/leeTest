package com.company.test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Copy {

    /**
     * 1784
     * 遍历文件夹下的所有图片文件，并复制到指定文件夹下
     */
    static String imgageFron = "D:\\images\\image0913";//源目录

    static List<String> path = new ArrayList<>();
    static List<String> absolutePath = new ArrayList<>();
    static List<String> fileName = new ArrayList<>();

    static String newPath = "D:\\images\\newImg0913"; //存放目录

    public static void main(String[] args) throws IOException {
        /**
         * 同种商品进行合并。
         */
        long t1 = System.currentTimeMillis();

        System.out.println("开始遍历文件");
        //读取文件夹下所有文件
        readfile(imgageFron);
        System.out.println("遍历文件完成,花费 " + (System.currentTimeMillis() - t1) + " ms");

        System.out.println("输入合并文件名称");
        Scanner scanner = new Scanner(System.in);
        String imageName = scanner.next();
        System.out.println("文件名称是:" + imageName);

        while (!imageName.equals("停止")) {
            //先删除文件，若存在
            delAllFile(new File(newPath + "\\" + imageName));
            //创建文件夹
            createPath(newPath + "\\" + imageName);

            int finishNums = 0; //记录数量
            for (int i = 0; i < path.size(); i++) {
                if (path.get(i).contains(imageName) && !path.get(i).contains("扁豆角") && !path.get(i).contains("黄皮洋葱")
                        && !path.get(i).contains("青柠") && !path.get(i).contains("大扁豆")) {

                    int start = path.get(i).lastIndexOf('\\') + 1;
                    String tempName = path.get(i).substring(start, path.get(i).length());
                    //复制文件
                    copyFile(path.get(i), newPath + "\\" + imageName + "\\" + tempName);

                    System.out.println("将 " + path.get(i) + " 移动到 " + newPath + "\\" + imageName);
                    System.out.println("完成第 " + ++finishNums + " 个");
                }
            }
            //如果没有。删除创建的文件夹
            if (finishNums == 0) {
                if (new File(newPath + "\\" + imageName).delete()) {
                    System.out.println("deleted");
                } else {
                    System.out.println("directory doesn't exist or not empty");
                }
            }
            System.out.println(imageName + " 完成 共 " + finishNums + " 个");

            System.out.println("输入合并文件名称");
            imageName = scanner.next();
            System.out.println("名称是:" + imageName);
        }
        scanner.close();
    }

    //获取路径下所有文件
    public static boolean readfile(String filepath) throws FileNotFoundException, IOException {
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
                        absolutePath.add(readfile.getAbsolutePath());
                        // System.out.println("absolutepath=" + readfile.getAbsolutePath());
                        fileName.add(readfile.getAbsolutePath());
                        //System.out.println("name=" + readfile.getName());
                    } else if (readfile.isDirectory()) {
                        readfile(filepath + "\\" + filelist[i]);
                    }
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("readfile()   Exception:" + e.getMessage());
        }
        return true;
    }

    //创建文件夹
    public static void createPath(String path) {
        File file = new File(path);
        if (!file.exists()) {//如果文件夹不存在
            file.mkdirs();//创建文件夹
        }
    }

    //复制文件
    public static void copyFile(String srcPath, String destPath) throws IOException {
        // 打开输入流
        FileInputStream fis = new FileInputStream(srcPath);
        // 打开输出流
        FileOutputStream fos = new FileOutputStream(destPath);
        // 读取和写入信息
        int len = 0;
        // 创建一个字节数组，当做缓冲区
        byte[] b = new byte[1024];
        while ((len = fis.read(b)) != -1) {
            fos.write(b, 0, len);
        }

        // 关闭流  先开后关  后开先关
        fos.close(); // 后开先关
        fis.close(); // 先开后关

    }

    //删除自己和目录下子文件
    public static void delAllFile(File file) {
        //删除自己所有的子文件和子目录
        //获取子文件和子目录
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                if (file1.isFile()) {
                    //System.out.println(file1.getName());
                    //干掉它
                    file1.delete();
                } else if (file1.isDirectory()) {
                    //继续查看
                    delAllFile(file1);
                }
            }
            //干掉自己
            //System.out.println(file.getName());
            file.delete();
        }
    }

}