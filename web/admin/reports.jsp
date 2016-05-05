<%-- 
    Document   : reports
    Created on : May 2, 2016, 11:09:47 PM
    Author     : DouglasJones
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <c:import url="/header.html" />
    <body>
        <h1>Administrative Users List</h1>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>User Name: <c:out value="${user.firstName} + ${user.lastName}"/></td>
            <td>User Address: <c:out value="${user.address} + ${user.city} + ${user.state} + ${user.zipcode} "/></td>
            <td>User Contact: <c:out value="${user.email} + ${user.phone}"/></td>
        </tr>
        </c:forEach>    
    </body>
</html>
