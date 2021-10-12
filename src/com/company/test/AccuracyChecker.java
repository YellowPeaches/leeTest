package com.company.test;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;

public class AccuracyChecker {
    public static void main(String[] args) {
        long lasting = System.currentTimeMillis();
        try {
            File f = new File("D:\\serverDetection\\xml_done\\33_1627984787730_1628013586538069747.jpg.xml");
            SAXReader reader = new SAXReader();
            Document doc = reader.read(f);
            Element root = doc.getRootElement();
            Element foo;
            for (Iterator i = root.elementIterator("annotation"); i.hasNext();) {
                foo = (Element) i.next();
                System.out.print("result:" + foo.elementText("result"));
                //System.out.println("车主地址:" + foo.elementText("result"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
