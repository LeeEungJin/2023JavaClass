package com.java.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class JDBC_Test {

	public static void main(String[] args) throws Exception{
		
		String driverClassName = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String username = "mire001";
		String password = "mire001";
		
		// 1. Driver loading
		Class.forName(driverClassName);
		System.out.println("1. Driver loading ����̹� �ε� ����");
		
		// 2. database connection
		Connection conn = DriverManager.getConnection(url, username, password);
		System.out.println("2. database connection ���� ����");
		
		// 3. sql 전송
		String sql = "select * from member"; // select ��������, * ������, from member �������
		Statement stmt = conn.createStatement();

		// 4. receive result
		ResultSet rs = stmt.executeQuery(sql);	// �������� ������ DBMS�� ������ ����
		
		// 5. get data
		while(rs.next()){
			String user = rs.getString("username");
			String pwd = rs.getString("password");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String phone = rs.getString("phone");
			Date inDate = rs.getDate("indate");
		
			String inDateStr = new SimpleDateFormat("yyyy-MM-dd").format(inDate);
			
			System.out.println(user+"\t"+pwd+"\t"+name+"\t"+email+"\t"+ phone +"\t"+inDateStr);
		}
		
		/*
		 * 1.Driver loading
		 * 2. database connection
		 * 3. sql 전송
		 * 4. receive result
		 * 5. get data
		*/
	}

}
