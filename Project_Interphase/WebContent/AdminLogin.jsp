<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="main.Admin_LoginProxy" %>

<%
    String name = request.getParameter("username");
    String pass = request.getParameter("pass");
    String valid = "abc"; // Initialize with a default value

    if (name != null && pass != null) {
        Admin_LoginProxy adminProxy = new Admin_LoginProxy();
        valid = adminProxy.getAdmin_Login().login_info(name, pass);
    }
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Electricity Bill Calculation - Admin Login</title>
    <style>
     body {
            margin: 0;
            padding: 0;
            background-color:#6abadeba;
            font-family: Arial, Helvetica, sans-serif;
            
        }

        form {
        
            background-color: #9dcfda;
            max-height: 700px;
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
            font-size: 15px;
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
        h1{
           text-align: center;
    color: #277582;
    padding: 20px;
        }

       
        
        image {
          max-width: 32%;
        height: auto;
        margin-right: auto;
        margin-left: auto;
    
        }
        
         button {
            font-size: 12px;
            background-color: #616161;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            text-align: center;
            margin-top: 5px;
            width: 70px;
            padding: 9px;
            justify-content: center;
        }
        button:hover{
        opacity: 0.8;
        }

        button:hover {
            background-color: #45a049;
        }
        
        calculatebill{
            font-size: 11px;
            background-color: #616161;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            margin-top: 5px;
            width: 200px;
            padding: 8px;
        
        }
    </style>
</head>
<body>
    <form action="" method="post">
    <h1> Admin login</h1>
     <div style="text-align: center;">
     <img class='image' src="C:\Users\ESHOP\Downloads\masculine-user-with-suit-tie-and-locked-padlock_icon-icons.com_68295.png" alt="admin">
     </div>
     <br>
        <label> Enter UserName:</label>
         <div style="text-align: center;">
        <input class='textbox' type="text" name="username" ></input>
        </div>
        <br>
        <label> Enter Password:</label>
        <div style="text-align: center;">
        <input class= 'textbox'type="password" name="pass" ></input>
        </div>
        <br>
        <div style="text-align: center;">
        <button type="submit">Login</button>
        </div>
       <br>
    </form>
     <% if(valid!=null && valid.equals("Login failed")) { %>

        <%} else if(valid.equals("successfully login")) { %>
   
        <form action="CalculateBill.jsp" method="post"><br>
        <div style="text-align: center;">
            <button class='calculatebill'type="submit"> Proceed Calculate Bill</button>
       </div>
    <% }  %>
    
     </form>
</body>
</html>
