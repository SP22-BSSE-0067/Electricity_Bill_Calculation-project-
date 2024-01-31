<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Meter Information</title>
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

        
         button {
            font-size: 12px;
            background-color: #616161;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            text-align: center;
            margin-top: 5px;
  width: 140px;
            padding: 9px;
            justify-content: center;
        }
        button:hover{
        opacity: 0.8;
        }

        button:hover {
            background-color: #45a049;
        }   
        p{
        text-align: center;
        font-size:16px;
        }
</style>
</head>
<body>


<form action="Info.jsp">

<h1>Customer Meter Information</h1>
<p>Insert Customer Name to get the Details</p>
<label>Customer Name</label>
<div style="text-align: center;">
<input name="customer_name"type="text"></input>
</div>

<div style="text-align: center;">
<button type="submit">Get Customer Info</button>
</div>

</form>
</body>
</html>