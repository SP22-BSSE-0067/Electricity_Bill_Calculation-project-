<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Information</title>
</head>
<body>
<h1>Customer Information</h1>
<form action="new_customer_addition.jsp">

<label>Customer Id     </label>
<input name="customer_id"type="text"></input>
<br/>
<br/>
<label>Customer Name   </label>
<input name="customer_name"type="text"></input>
<br/>
<br/>
<label>Customer Address</label>
<input name="adress"type="text"></input>
<br/>
<br/>
<label>Customer Email </label>
<input name="email"type="text"></input>
<br/>
<br/>
<label>Customer Ph_no </label>
<input name="ph_no"type="text"></input>
<br/>
<br/>
<button type="submit">Add Customer</button>

</form>

</body>
</html>