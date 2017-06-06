<%-- 
    Document   : sucesso_excluir_ordem_de_servico_computador
    Created on : 21/05/2017, 20:11:05
    Author     : Diego
--%>

<%@page import="modelos.Computadores"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Excluir Ordem de Serviço</title>
    </head>
    <body>
        
        <header>
        <jsp:include page="header.jsp"/>
        </header>
        
        <h1>Excluir Ordem de Serviço</h1>

        <br>
        <br>
        <%  Computadores computadores = new Computadores();
            computadores=(Computadores)request.getAttribute("computador");      
        %>
        
            <form method="decisao" action="ExcluirOrdemDeServicoComputador1">
            <table width="50%" align="center" border="1">
                <tr>
                    <td width="180" align="left">Protocolo:</td>
                    <td><input type="text" name="protocolo" value="<%=String.valueOf(computadores.getProtocolo())%>" size="82" maxlength="50"></td>
                </tr>
                <tr>
                    <td width="180" align="left">Cliente:</td>
                    <td><input type="text" name="cliente" value="<%=computadores.getCliente()%>" size="82" maxlength="50"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Data:</td>
                    <td><input type="text" name="data" value="<%=computadores.getDataEntrada()%>" size="30" maxlength="10"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Data da Compra:</td>
                    <td><input type="text" name="dataCompra" size="30" value="<%=computadores.getDataCompra()%>" maxlength="10"></td>
                </tr> 
                <tr>
                    <td size="50" align="left">Garantia:</td>
                    <td><input type="text" name="garantia" size="82" value="<%=computadores.getGarantia()%>" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Marca:</td>
                    <td><input type="text" name="marca" value="<%=computadores.getMarca()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Modelo:</td>
                    <td><input type="text" name="modelo" value="<%=computadores.getModelo()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Serial:</td>
                    <td><input type="text" name="serial" value="<%=computadores.getSeriall()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Acessórios</td> 
                    <td><input type="text" name="acessorios" value="<%=computadores.getAcessorios()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Defeito:</td>
                    <td><input type="text" name="defeito" value="<%=computadores.getDefeito()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Estado do Aparelho:</td>
                    <td><input type="text" name="estadoAparelho" value="<%=computadores.getEstado()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Valor do Serviço:</td>
                    <td><input type="text"  name="valorServico" value="<%=String.valueOf(computadores.getValor())%>" size="30" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Situação:</td>
                    <td><input type="text" name="situacao" size="82" value="<%=computadores.getSituacao()%>" maxlength="100"></td>
                </tr>
                    <tr>
                    <td size="50" align="left">Observações:</td>
                    <td><input type="text" name="observacao" value="<%=computadores.getObservacoes()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Atendente:</td>
                    <td><input type="text" name="atendente" value="<%=computadores.getAtendente()%>" size="82" maxlength="100"></td>
                </tr>
            </table>   
                <br>
                <br>
                
                <center>
                    Deseja excluir essa ordem de serviço? <br>
                    <input type="submit" name="excluir" value="Sim">
                    <input type="submit" name="excluir" value="Não">  
                </center>
                </form>
    </body>
</html>
