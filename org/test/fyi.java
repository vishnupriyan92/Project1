package org.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class fyi {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hexa_schema","root","");
	String sql = "select * from hexa_schema.hexa_table";
	PreparedStatement ps = con.prepareStatement(sql);
	ResultSet rs = ps.executeQuery();
	while (rs.next()) {
	int id = rs.getInt("id");
	String username = rs.getString("usename");
	String password = rs.getString("password");
		System.out.println(id+" "+username+" "+password);
}
}}
