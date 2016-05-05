<%-- 
    Document   : new_customer
    Created on : Mar 28, 2016, 9:57:51 AM
    Author     : DouglasJones
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html" />
    
    <body>
        <header><h1>Titan Bank - New Customer</h1></header>
        <c:import url="/navigation.html" />
        <p>Please complete the new customer application.</p>
        
        <c:if test="${message != null}"> 
            <p><i>${message}</i></p>
        </c:if>
            
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
            <label>Password: </label>
            <input type="text" name="Password" ><br>
            
            <input type="submit" value="Submit">
        </form>
     <c:import url="/footer.jsp" />   
    </body>
       
</html>
