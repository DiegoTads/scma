<%-- 
    Document   : PesquisarOrdemDeServicoComputador
    Created on : 16/05/2017, 21:42:50
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesquisar Ordem de Serviço</title>
    </head>
    <body>
        <header>
        <jsp:include page="header.jsp"/>
        </header>
        
        <h1>Pesquisar Ordem de Serviço</h1>
        
        <br>
        <br>
        
        <form action="PesquisarOrdemDeServicoComputador">    
            <center>
                Protocolo*:<input type="text" name="protocolo" size="50" maxlength="50">
                <input type="submit" value="Pesquisar"> 
            </center>
        
        </form>
        
        *=Campos Obrigatórios.
    </body>
</html>
