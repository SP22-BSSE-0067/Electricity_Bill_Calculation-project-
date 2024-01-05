package main;

import java.sql.*;

public class Add_new_customer {

	public void add_customerinfo(int customer_id, String customer_name, String adress, String email, String ph_no) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/add_new_meter","root","");
			Statement stmt=con.createStatement();
			
			
			stmt.executeUpdate("INSERT INTO customer VALUES ('"+customer_id+"','"+customer_name+"','"+adress+"','"+email+"', '"+ph_no+"')");
			
		
			
		
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}

}
