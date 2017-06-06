<%-- 
    Document   : menu
    Created on : 22/05/2017, 22:06:51
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema para Controle de Manutenção de Aparelhos</title>
    </head>
    <body>
        
        <header>
        <jsp:include page="header.jsp"/>
        </header>

        <br>
        <br>
        
        <h1>Menu:</h1>
        
        <br>
        
        <a href="crud_telefones.jsp" target = "ordemDeServico">Assistencia Tecnica de Celulares</a><br><br>
        <a href="crud_computadores.jsp" target = "ordemDeServico">Assistencia Tecnica de Computadores</a><br><br>     
        
    </body>
</html>
