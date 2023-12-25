package main;

import java.sql.*;

public class Electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/add_new_meter","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from admin");

			while(rs.next())
			{
			System.out.println("Admin_id: " + rs.getInt(1) + " username: " + rs.getString(2) + " email: "
			+ rs.getString(3) +  " password: " + rs.getString(4));
			}
			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}

	}

}
