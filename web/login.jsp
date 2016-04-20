
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html" />
    
    <body>
        <header><h1>Titan Bank - Login</h1></header>
        <c:import url="/navigation.html" />
        <p></p>
        <form action="login" method ="post">
            <input type="hidden" name="action" value="login">
            <label>Username: </label>
            <input type="text" name="username" required><br>
            <label>Password: </label>
            <input type="password" name="password" required>
            <input type="submit" value="Submit">
        </form>
        
        
      <c:import url="/footer.jsp" />     
    </body>
</html>
