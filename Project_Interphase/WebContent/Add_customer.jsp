<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Information</title>
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
         padding: 10px;
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
</style>


</head>
<body>

<form action="new_customer_addition.jsp">
<h1>Customer Information</h1>
<label>Customer Id     </label>
<div style="text-align: center;">
<input name="customer_id"type="text"></input>
</div>
<br/>
<label>Customer Name   </label>
<div style="text-align: center;">
<input name="customer_name"type="text"></input>
</div>
<br/>
<label>Customer Address</label>
<div style="text-align: center;">
<input name="adress"type="text"></input>
</div>
<br/>
<label>Customer Email </label>
<div style="text-align: center;">
<input name="email"type="text"></input>
</div>
<br/>
<label>Customer Ph_no </label>
<div style="text-align: center;">
<input name="ph_no"type="text"></input>
</div>
<br/>
<div style="text-align: center;">
<button type="submit">Add Customer</button>
</div>
<br>
</form>

</body>
</html>