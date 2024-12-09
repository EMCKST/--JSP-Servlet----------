package cn.market.util;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tool {
	public static Connection getConn(){
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/market?useUnicode=true&characterEncoding=utf8";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, "root", "root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
//	public static void main(String[] args) {
//		System.out.println(getConn());
//	}
	
}
