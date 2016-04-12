<!DOCTYPE html>
<!--
Douglas Jones - 2286699 - COP2806
-->
<html>
    <head>
        <title>TOBA - Success!!</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
         <header><h1>Titan Bank</h1></header>
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
        
        
    </body>
</html>
