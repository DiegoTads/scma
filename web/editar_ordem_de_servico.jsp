<%-- 
    Document   : EditarOrdemDeServico
    Created on : 15/05/2017, 15:10:50
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Ordem de Serviço</title>
    </head>
    <body>
        <header>
        <jsp:include page="header.jsp"/>
        </header>
        
        <h1>Editar Ordem de Serviço</h1>
        
        <br>
        <br>
        
        <form action="EditarOrdemDeServico">    
            <center>
                Protocolo*:<input type="text" name="protocolo" size="50" maxlength="50">
                <input type="submit" name="pesquisar" value="Pesquisar"> 
            </center>
        
        </form>
        
        *=Campos Obrigatórios.
    </body>
</html>
