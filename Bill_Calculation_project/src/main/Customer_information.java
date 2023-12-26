package main;

import java.sql.*;

public class Customer_information{
	public String getcustomer_info(String customer_name) {
	
	
	 try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/add_new_meter","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * from customer join meter_data on customer.customer_id = meter_data.Customer_id where customer_name = '" + customer_name +"' ;");
	         
			rs.next();
			
			String customerinfo = (" ID: " + rs.getInt(1) + " customer_name: " + rs.getString(2)
			+ " adress: " + rs.getString(3) + " : email : " + rs.getString(4) + " ph_no : " + rs.getString(5) 
			+ " meter no: "+ rs.getInt(6) + " id: "+ rs.getInt(7)+  " location: " + rs.getString(8) + " date: " + rs.getString(9) +" Status:" + rs.getString(10));
			
			con.close();
			
			return customerinfo;
			
			
			} catch(Exception e)
			{
			System.out.println(e);
			}

	return "";
	}
	}
	

