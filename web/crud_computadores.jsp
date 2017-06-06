<%-- 
    Document   : CRUDComputadores
    Created on : 16/05/2017, 20:13:57
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema para Controle de Manutenção de Aparelhos - Computadores</title>
    </head>
    <body>
        <header>
        <jsp:include page="header.jsp"/>
        </header>
        
        <br>
        <br>
        
        <h1>Menu - Computadores:</h1>
        
        <br>
        
        <a href="adicionar_ordem_de_servico_computador.jsp" target = "ordemDeServico">Adicionar Ordem de Serviço</a><br><br>
        <a href="editar_ordem_de_servico_computador.jsp" target = "ordemDeServico">Editar Ordem de Serviço</a><br><br>
        <a href="pesquisar_ordem_de_servico_computador.jsp" target = "ordemDeServico">Pesquisar Ordem de Serviço</a><br><br>
        <form action="ListarOrdemDeServicoComputador">
        <a href="ListarOrdemDeServicoComputador" target = "ordemDeServico">Lista de Ordem de Serviço</a><br><br>
        </form>
        <a href="excluir_ordem_de_servico_computador.jsp" target = "ordemDeServico">Excluir Ordem de Serviço</a><br><br>
        
    </body>
</html>
