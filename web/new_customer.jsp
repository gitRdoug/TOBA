<%-- 
    Document   : new_customer
    Created on : Mar 28, 2016, 9:57:51 AM
    Author     : DouglasJones
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TOBA - New Customer</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
        <meta charset="UTF-8">
    </head>
    
    <body>
        <header><h1>Titan Bank</h1></header>
        <nav>
            <a href="index.html">Home</a> |
            <a href="login.html">Login</a> |
            <a href="new_customer.jsp">New Customer Sign Up</a>
        </nav>
        <p>Please complete the new customer application.</p>
        <p><i>${message}</i></p>
        <form action="newCustomer" method ="post">
            <input type="hidden" name="action" value="add">
            <label>First Name: </label>
            <input type="text" name="FirstName" ><br>
             <label>Last Name: </label>
            <input type="text" name="LastName" ><br>
             <label>Phone: </label>
            <input type="text" name="Phone" ><br>
             <label>Address: </label>
            <input type="text" name="Address" ><br>
             <label>City: </label>
            <input type="text" name="City" ><br>
             <label>State: </label>
            <input type="text" name="State" ><br>
             <label>Zip Code: </label>
            <input type="text" name="ZipCode"><br>
             <label>Email: </label>
            <input type="email" name="Email" ><br>
            <input type="submit" value="Submit">
        </form>
        
    </body>
       
</html>
