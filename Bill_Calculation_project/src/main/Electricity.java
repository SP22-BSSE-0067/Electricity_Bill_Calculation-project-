package main;

import java.sql.*;

public class Electricity {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/add_new_meter","root","");
			Statement stmt=con.createStatement();
			ResultSet rs= stmt.executeQuery("select * from customer inner join meter_data on customer.customer_id = meter_data.Customer_id");

			while(rs.next())
			{
			System.out.println("id : " + rs.getInt(1) + " customer_name: " + rs.getString(2) 
			+ " adress: "+ rs.getString(3) +  " email: " + rs.getString(4) + " ph_no: " + rs.getString(5)
			+ " meter no: "+ rs.getInt(6) + " Customer_id : "+ rs.getInt(7)+  " location: " + rs.getString(8) 
			+ " date : " + rs.getString(9) +" Status: " + rs.getString(10));
			}
			con.close();
			
			} catch(Exception e)
			{
			System.out.println(e);
			}

	}

}
