package com.company;

import java.sql.*;

/**
 * jdbc操作
 */

public class Main {

    public static void main(String[] args) throws SQLException {
	// write your code here
        //1. 注册驱动
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        //2. 获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB?useSSL=false","root","tracy147");
        //3. 获取操作数据库的预处理对象
        PreparedStatement pstm = conn.prepareStatement("select * from customer");
        //4. 执行sql语句并获取返回结果
        ResultSet rs = pstm.executeQuery();
        //5. 封装结果集
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }
        //6. 释放资源
        rs.close();
        pstm.close();
        conn.close();
    }
}
