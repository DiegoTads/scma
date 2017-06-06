<%-- 
    Document   : SucessoAdicionarOrdemDeServico
    Created on : 16/05/2017, 22:50:51
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
        
        <h1>Ordem de serviço cadastrada com sucesso !!!</h1>
        
        <br>
        <br>
        
        <h1>Anote o numero do protocolo: <%= request.getAttribute("protocolo") %></h1>
    </body>
</html>
