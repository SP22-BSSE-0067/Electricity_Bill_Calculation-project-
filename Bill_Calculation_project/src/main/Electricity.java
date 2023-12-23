package main;

import java.sql.*;

public class Electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/tuturial","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from teacher");

			while(rs.next())
			{
			System.out.println("ID: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Designation: "
			+ rs.getString(3) +  " roomid: " + rs.getInt(4));
			}
			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}

	}

}
