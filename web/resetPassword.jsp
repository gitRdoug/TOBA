<%-- 
    Document   : reset_password
    Created on : Apr 11, 2016, 7:36:43 PM
    Author     : DouglasJones
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html" />
    <body>
        <header><h1>Titan Bank - Reset Password</h1></header>
        <c:import url="/navigation.html" />
        <h2>Hello ${user.firstName}  ${user.lastName} </h2>
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
        <c:import url="/footer.jsp" />   
    </body>
</html>
