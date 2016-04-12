<%-- 
    Document   : reset_password
    Created on : Apr 11, 2016, 7:36:43 PM
    Author     : DouglasJones
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <link rel="stylesheet" href="styles/main.css" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TOBA - Reset Password</title>
    </head>
    <body>
        <header><h2>Reset Password</h2></header>
        
       
        <p><i>${message}</i></p>
        
        <form action="resetPassword" method="post" >
            <input type="hidden" name="action" value="reset">
            <label>Current Password:</label>
            <input type="password" name="CurrentPassword"><br>
            <p>===============================================</p>
            <label>New Password: </label>
            <input type="password" name="NewPassword" >
             <label>Confirm New Password: </label>
             <input type="password" name="ConfirmNewPassword" ><br>
             <p></p>
            <input type="submit" value="Reset Password">
        </form>
    </body>
</html>
