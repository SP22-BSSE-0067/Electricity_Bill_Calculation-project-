package main;

import java.sql.DriverManager;

import java.sql.*;

public class calculate_bill {
	public double calculate_billing(int Meter_No) {
		double TariffRate = 0.10;
	   double BillPay=0;
		 try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con =
				DriverManager.getConnection("jdbc:mysql://localhost:3306/add_new_meter","root","");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("SELECT Meter_No,Unit_Consumption from consumption_data  where Meter_No= '" + Meter_No +"'");
		        
				if (rs.next()) {
	                int UnitConsumptionFromDB = rs.getInt("Unit_Consumption");
	               BillPay = UnitConsumptionFromDB * TariffRate;
	               System.out.println("Total Calculated Bill:"+BillPay+ "$");
	            } else {
	                System.out.println("No consumption data found for Meter No. " + Meter_No);
	            }
				con.close();
		 } catch(Exception e)
	                {
	                System.out.println(e);
	            }
	                	
		 return BillPay;
		}
}
