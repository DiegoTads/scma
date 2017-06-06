<%-- 
    Document   : CRUDTelefones
    Created on : 16/05/2017, 20:11:30
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema para Controle de Manutenção de Aparelhos - Telefones</title>
    </head>
    <body>
        <header>
        <jsp:include page="header.jsp"/>
        </header>
        
        <br>
        <br>
        
        <h1>Menu - Telefones:</h1>
        
        <br>
        
        <a href="adicionar_ordem_de_servico.jsp" target = "ordemDeServico">Adicionar Ordem de Serviço</a><br><br>
        <a href="editar_ordem_de_servico.jsp" target = "ordemDeServico">Editar Ordem de Serviço</a><br><br>
        <a href="pesquisar_ordem_de_servico.jsp" target = "ordemDeServico">Pesquisar Ordem de Serviço</a><br><br>
        <form action="ListarOrdemDeServico">
        <a href="ListarOrdemDeServico" target = "ordemDeServico">Lista de Ordem de Serviço</a><br><br>
        </form>
        <a href="excluir_ordem_de_servico.jsp" target = "ordemDeServico">Excluir Ordem de Serviço</a><br><br>

    </body>
</html>
