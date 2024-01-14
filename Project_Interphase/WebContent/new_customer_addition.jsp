<%@ page import="main.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Customer</title>
</head>
<body>

<%



    // Retrieve form parameters
    int customer_id = Integer.parseInt(request.getParameter("customer_id"));
    String customer_name = request.getParameter("customer_name");
    String address = request.getParameter("address");
    String email = request.getParameter("email");
    String ph_no = request.getParameter("ph_no");


    Add_new_customer addCustomer = new Add_new_customerProxy().getAdd_new_customer();

   
    addCustomer.add_customerinfo(customer_id, customer_name, address, email, ph_no);

    
    out.println("<p>Data added successfully in the database!</p>");


%>

</body>
</html>