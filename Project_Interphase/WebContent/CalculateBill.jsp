<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="main.Calculate_billProxy" %>

<%
    int meterNo = 0;
    double result = 0.0;

    if (request.getParameter("meter_no") != null) {
        meterNo = Integer.parseInt(request.getParameter("meter_no"));

        Calculate_billProxy calculateProxy = new Calculate_billProxy();
        result = calculateProxy.getCalculate_bill().calculate_billing(meterNo);
      
    }
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Electricity Bill Calculation - Calculate Bill </title>
    <style>
     body {
            margin: 0;
            padding: 0;
            background-color:#6abadeba;
            font-family: Arial, Helvetica, sans-serif;
            
        }

        form {
        
            background-color: #9dcfda;
            max-height: 1100px;
            border: 2px solid #f1f1f1;
            border-color: black;
            max-width: 350px;
            margin: 100px auto;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            
            
        }

        label {
            display: block;
            margin-bottom: 5px;
            text-align: center;
            font-size: 14px;
            font-weight: bold;
        }

        textbox {
            max-width: 240px;
            padding: 3px;
            margin-bottom: 5px;
            box-sizing: border-box;
            display: inline-block;
             border: 3px solid #ccc;
             border-radius: 2px;
             margin-left: 500px auto;
             display: block;
              position:relative ;
        }
        
         button {
            font-size: 12px;
            background-color: #616161;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            text-align: center;
            margin-top: 8px;
            margin-bottom: 8px;
            padding-top: 8px;
            padding-bottom:8px;
            width: 100px;
            padding: 5px;
            justify-content: center;
        }
        button:hover{
        opacity: 0.8;
        }

        button:hover {
            background-color: #45a049;
        }
          
          image {
          width: 40%;
          height: auto;
          margin-right: auto;
           margin-left: auto;
    
        }
        h1{
          text-align: center;
         color: #277582;
         padding: 10px;
        }
    </style>
</head>
<body>
    <form action="" method="post">
        <br><br>
        <h1><i>Electricity Bill Project</i></h1>
       <div style="text-align: center;">
     <img class='image' src="C:\Users\ESHOP\Downloads\bill_power_electricity_energy_icon_142267.png" alt="Home">
     </div>
     <br>
     <div style="text-align: center;">
        <label>Enter meter number:</label>
        </div>
        <div style="text-align: center;">
        <input type="text" name="meter_no" ></input><br>
        </div>
        <br>
        <div style="text-align: center;">
         <button class='calculatebill'type="submit">Calculate Bill</button>
        </div>
        <br>
    </form>

 <% if (result != 0.0) { %>
    <label>Your Bill: $<%= result %></label>
<% } else { %>
    <label>No consumption data found of Meter No: <%= meterNo %></label>
<% } %>
</body>
</html>
