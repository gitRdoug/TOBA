<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html" />
    <body>
         <header><h1>Titan Bank - Success</h1></header>
         <c:import url="/navigation.html" />
        <div>Success - New Customer Account Created!</div>
        <p>Hello ${user.firstName}  ${user.lastName} </p>
        <p>Please review the information below.</p>
        <p>Phone: ${user.phone}</p>
        <p>Address: ${user.address}</p>
        <p>City: ${user.city}</p>
        <p>State: ${user.state}</p>
        <p>Zip Code: ${user.zipCode}</p>
        <p>Email: ${user.email}</p>
        <p></p>
        <p>Your User Name is: ${user.userName}</p>
        <p>Your temporary password is: ${user.password}</p>
        <p>Please reset your password</p>
        <form action="resetPassword.jsp">
            <input type="submit" value="Reset Password">
        </form>
        <c:import url="/footer.jsp" />   
        
    </body>
</html>
