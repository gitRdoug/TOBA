<%-- 
    Document   : footer
    Created on : Apr 20, 2016, 1:27:30 AM
    Author     : DouglasJones
--%>
<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%  
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
%>
<p>&copy; Copyright <%= currentYear %> Douglas Jones Web Applications</p>