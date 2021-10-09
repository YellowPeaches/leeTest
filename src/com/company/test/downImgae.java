package com.company.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class downImgae {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Connection conn = JDBCUtils.getConnection();      //JDBCUtils 自己定义的一个类
        PreparedStatement pre = null;
        ResultSet res = null;
        String sql = "SELECT * FROM `sku_image` WHERE group_id = 83 AND is_marked = 0 AND is_delete = 0";
        try {
            pre = conn.prepareStatement(sql);
           // pre.setString(1,"wqq");
            res = pre.executeQuery();
            //调用将结果集转换成实体对象方法
            List list = JDBCUtils.Populate(res, SkuImage.class);
            //循环遍历结果
            for(int i=0;i<list.size();i++){
                SkuImage skuImage = (SkuImage) list.get(i);
                download(skuImage.getUrl(), skuImage.getName(), "d:\\aaaimage\\");
                System.out.println(skuImage.getUrl()+" 完成 "+ i);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void download(String urlString, String filename,String savePath) throws Exception {
        // 构造URL
        URL url = new URL(urlString);
        // 打开连接
        URLConnection con = url.openConnection();
        //设置请求超时为5s
        con.setConnectTimeout(5*1000);
        // 输入流
        InputStream is = con.getInputStream();

        // 1K的数据缓冲
        byte[] bs = new byte[1024];
        // 读取到的数据长度
        int len;
        // 输出的文件流
        File sf=new File(savePath);
        if(!sf.exists()){
            sf.mkdirs();
        }
       // 获取图片的扩展名
        String extensionName = filename.substring(filename.lastIndexOf(".") +     1);
        // 新的图片文件名 = 编号 +"."图片扩展名
        String newFileName = filename+ "." + extensionName;
        OutputStream os = new FileOutputStream(sf.getPath()+"\\"+filename);
        // 开始读取
        while ((len = is.read(bs)) != -1) {
            os.write(bs, 0, len);
        }
        // 完毕，关闭所有链接
        os.close();
        is.close();
    }




//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection connection = DriverManager.getConnection("jdbc:mysql://114.115.174.123:3306/sku_identify?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8", "identify", "winteclsq2017##");
//        String sql = "SELECT * FROM `sku_image` WHERE group_id = 83 AND is_marked = 0 AND is_delete = 0";
//        Statement st = connection.createStatement();
//        List<SkuImage> ansList= st.executeUpdate(sql);
//        int ou = st.executeUpdate(sql);
//        st.close();
//        connection.close();
//    }
}
