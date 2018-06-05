package com.ehealth.utill;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	static Connection connection=null;
	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/ehealthcare", "root", "root");
		 System.out.println("+++++++++++++" + connection);
		return connection;
	}
	/*public static void main(String[] args) {
	System.out.println("inside a main");	
	try {
		System.out.println(getConnection());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}*/
	public static void main(String[] args) {
		String id="PHARM1";
		int l=id.length();
		String sub=id.substring(5, l);
		System.out.println(sub);
		id="PHARM"+String.valueOf((new Integer(sub)+1));
		System.out.println(id);
		 l=id.length();
			 sub=id.substring(5, l);
			System.out.println(sub);
			id="PHARM"+String.valueOf((new Integer(sub)+1));
			System.out.println(id);

	}
}
