package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Admin_Login {
	public static String login_info (String Username, String Password) {
		String name = null,password = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/add_new_meter","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from admin where Username ='"+Username+"' and Password = '" +Password+"'");
			if(rs.next()) {
				
			
			
		     name= rs.getString(2);
		     password= rs.getString(3);
			
			if(name.equals(Username) && password.equals(Password)) {
				return("successfully login");

				}
			}
			con.close();
			
		       
			} catch(Exception e)
			{
			System.out.println(e);
			}
		return " Login failed";
	}
}
