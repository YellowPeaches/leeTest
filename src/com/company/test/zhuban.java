package com.company.test;

import java.io.*;

public class zhuban {
    public static void main(String[] args) {
        System.out.println(getOSName());
        System.out.println(getMainBordId_windows());
        System.out.println(getWindowsMACAddress());
    }

    public static String getWindowsMACAddress() {
        String address = "";
        try {
            ProcessBuilder pb = new ProcessBuilder("ipconfig", "/all");
            Process p = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.indexOf("Physical Address") != -1) {
                    int index = line.indexOf(":");
                    address = line.substring(index + 1);
                    break;
                }
            }
            br.close();
            return address.trim();
        } catch (IOException e) {
        }
        return address;
    }

    public static String getOSName() {
        return System.getProperty("os.name").toLowerCase();
    }

    public static String getMainBordId_windows() {
        String result = "";
        try {
            File file = File.createTempFile("realhowto", ".vbs");
            file.deleteOnExit();
            FileWriter fw = new java.io.FileWriter(file);

            String vbs = "Set objWMIService = GetObject(\"winmgmts:\\\\.\\root\\cimv2\")\n"
                    + "Set colItems = objWMIService.ExecQuery _ \n"
                    + "   (\"Select * from Win32_BaseBoard\") \n"
                    + "For Each objItem in colItems \n"
                    + "    Wscript.Echo objItem.SerialNumber \n"
                    + "    exit for  ' do the first cpu only! \n" + "Next \n";

            fw.write(vbs);
            fw.close();
            Process p = Runtime.getRuntime().exec(
                    "cscript //NoLogo " + file.getPath());
            BufferedReader input = new BufferedReader(new InputStreamReader(
                    p.getInputStream()));
            String line;
            while ((line = input.readLine()) != null) {
                result += line;
            }
            input.close();
        } catch (Exception e) {
            System.out.println("----" + e);
        }
        return result.trim();
    }
}
