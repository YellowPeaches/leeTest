//package com.company.normal;
//
////import org.dom4j.Document;
////import org.dom4j.DocumentException;
////import org.dom4j.DocumentHelper;
////import org.dom4j.Element;
//
//import java.util.List;
//
//public class _134 {
//    public static void main(String[] args) throws DocumentException {
//        String xml ="<Item>\n" +
//                "            <PLU>5654</PLU>\n" +
//                "            <DepartmentID>0</DepartmentID>\n" +
//                "            <AlternativeItemIDs Action=\"Create\">\n" +
//                "                <AlternativeItemID>2261586</AlternativeItemID>\n" +
//                "            </AlternativeItemIDs>\n" +
//                "            <Descriptions Action=\"Create\">\n" +
//                "                <Description Type=\"ItemName\">蟹味菇</Description>\n" +
//                "                <Description ID=\"0\" Type=\"ExtraText\"></Description>\n" +
//                "                <Description Type=\"ShortPinYinCode\" Index=\"1\">XWG</Description>\n" +
//                "            </Descriptions>\n" +
//                "            <ItemPrices Action=\"Update\">\n" +
//                "                <ItemPrice ValueTypeCode=\"BasePrice\" Index=\"0\" UnitOfMeasureCode=\"PCS\" PriceOverrideFlag=\"false\"\n" +
//                "                           DiscountFlag=\"false\" Hidden=\"false\">5.8\n" +
//                "                </ItemPrice>\n" +
//                "            </ItemPrices>\n" +
//                "            <Dates Action=\"Create\">\n" +
//                "                <DateOffset Type=\"PackedDate\" UnitOfOffset=\"day\" IsPrintEnabled=\"false\">0</DateOffset>\n" +
//                "                <DateOffset Type=\"SellBy\" UnitOfOffset=\"day\" IsPrintEnabled=\"false\">0</DateOffset>\n" +
//                "            </Dates>\n" +
//                "            <TraceInfoID></TraceInfoID>\n" +
//                "            <LabelFormats Action=\"Create\">\n" +
//                "                <LabelFormatID Index=\"0\">0</LabelFormatID>\n" +
//                "            </LabelFormats>\n" +
//                "        </Item>";
//        XMLToJson(xml);
//    }
//
//    public static int canCompleteCircuit(int[] gas, int[] cost) {
//        int gasLen = gas.length;
//        int curSum = 0;
//        int sum = 0;
//        int start = 0;
//        for (int i = 0; i < gasLen; i++) {
//            curSum += gas[i] - cost[i];
//            sum += gas[i] - cost[i];
//            if (curSum < 0) {
//                start = i + 1;
//                curSum = 0;
//            }
//        }
//        if (sum < 0) {
//            return -1;
//        } else {
//            return start;
//        }
//    }
//
//
//
//    public static void XMLToJson(String xmlString) throws DocumentException {
//        Document document = DocumentHelper.parseText(xmlString);
//
//
//
//        Element rootElement = document.getRootElement();
//        System.out.println("1.------->文件的根节点的名字是:"+rootElement.getName());
//
//        System.out.println("2.------->获取根标签users的子标签列表");
//        List<Element> usersSubElementList = rootElement.elements();
//        String alternativeItemID = rootElement.elementText("AlternativeItemID");
//
//        for (Element userElement : usersSubElementList) {
//
//            System.out.println("users标签的子标签的名字是"+ userElement.getName());
//            System.out.println(""+ userElement.getText());
//            System.out.println("users标签的子标签的id属性值是"+ userElement.attributeValue("DepartmentID"));
//            System.out.println("users标签的子标签的country属性值是"+ userElement.attributeValue("DepartmentID"));
//            System.out.println("3.------->获取user的子标签列表");
//            List<Element> userSubElementList = userElement.elements();
//            for (Element userSubElement : userSubElementList) {
//                System.out.println("user标签下的子标签名为:"+userSubElement.getName());
//                System.out.println("user标签下的子标签文本是:"+userSubElement.getText());
//            }
//        }
//        //获取users标签的第一个user标签
//        Element firstUserElement = rootElement.element("user");
//        //第一个user标签的子标签password的文本内容
//        String password = firstUserElement.attributeValue("password");
//        System.out.println(password);
//    }
//}
