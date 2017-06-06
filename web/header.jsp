<%-- 
    Document   : RodaPe
    Created on : 16/05/2017, 21:44:06
    Author     : Diego
--%>

<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JR CELULARES - Sistema para Controle de Manutenção de Aparelhos</h1>
        <br>
        
        <%
            Calendar c = Calendar.getInstance();
            DateFormat formato = new SimpleDateFormat("HH:mm:ss.SSS");
        %>
        
        Data: <%= c.get(Calendar.DAY_OF_MONTH)%>/<%= (c.get(Calendar.MONTH)+1)%>/<%= c.get(Calendar.YEAR)%> <br>
        Hora: <%= c.get(Calendar.HOUR)%>:<%= c.get(Calendar.MINUTE)%>:<%= c.get(Calendar.SECOND)%>
    
    </body>
</html>
