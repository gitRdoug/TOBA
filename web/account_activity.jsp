
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html" />
    <body>
         <header><h1>Titan Bank - Account Activity</h1></header>
         <c:import url="/navigation.html" />
         
        <h2>Hello ${user.firstName}  ${user.lastName} </h2>
        <h3>Account Information</h3>
        <p>User Name: ${user.userName}</p>
        <p>Phone: ${user.phone}</p>
        <p>Address: ${user.address}</p>
        <p>City: ${user.city}</p>
        <p>State: ${user.state}</p>
        <p>Zip Code: ${user.zipCode}</p>
        <p>Email: ${user.email}</p>
        <p></p>
        <p>Reset Password</p>
        <form action="resetPassword.jsp">
            <input type="submit" value="Reset Password">
        </form>
        <h2>Account Balances</h2>
        <h3>Checking: ${checking.balance} || Savings: ${savings.balance}</h3>
        <form action="transaction.jsp">
            <input type="submit" value="Transfer Funds">
        </form>
    <c:import url="/footer.jsp" />   
    </body>
</html>
