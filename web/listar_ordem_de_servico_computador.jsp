<%-- 
    Document   : ListarOrdemDeServicoComputador
    Created on : 16/05/2017, 21:42:27
    Author     : Diego
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelos.Computadores"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Ordens de Serviço - Computadores</title>
    </head>
    <body>
        <header>
        <jsp:include page="header.jsp"/>
        </header>
 
        <h1>Lista de Ordens de Serviço</h1>

        <%  Computadores computador = new Computadores();
            ArrayList<Computadores> arrayComp = new ArrayList<Computadores>();
            arrayComp=(ArrayList<Computadores>)request.getAttribute("arrayComp");      
        %>
        
        <br>
        Quantidade de ordens de serviço: <%=arrayComp.size()%>
        <br>
        
        <%for(int i=0;i<arrayComp.size();i++){
            
            computador=arrayComp.get(i);
        %>
            <br>
            <br>
            <table width="50%" align="center" border="1">
                <tr>
                    <td width="180" align="left">Protocolo:</td>
                    <td><input type="text" name="protocolo" value="<%=String.valueOf(computador.getProtocolo())%>" size="82" maxlength="50"></td>
                </tr>
                <tr>
                    <td width="180" align="left">Cliente:</td>
                    <td><input type="text" name="cliente" value="<%=computador.getCliente()%>" size="82" maxlength="50"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Data:</td>
                    <td><input type="text" name="data" value="<%=computador.getDataEntrada()%>" size="30" maxlength="10"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Data da Compra:</td>
                    <td><input type="text" name="dataCompra" size="30" value="<%=computador.getDataCompra()%>" maxlength="10"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Garantia:</td>
                    <td><input type="text" name="garantia" size="82" value="<%=computador.getGarantia()%>" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Marca:</td>
                    <td><input type="text" name="marca" value="<%=computador.getMarca()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Modelo:</td>
                    <td><input type="text" name="modelo" value="<%=computador.getModelo()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Serial:</td>
                    <td><input type="text" name="serial" value="<%=computador.getSeriall()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Acessórios</td> 
                    <td><input type="text" name="acessorios" value="<%=computador.getAcessorios()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Defeito:</td>
                    <td><input type="text" name="defeito" value="<%=computador.getDefeito()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Estado do Aparelho:</td>
                    <td><input type="text" name="estadoAparelho" value="<%=computador.getEstado()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Valor do Serviço:</td>
                    <td><input type="text" value="00" name="valorServico" value="<%=String.valueOf(computador.getValor())%>" size="30" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Situação:</td>
                    <td><input type="text" name="situacao" size="82" value="<%=computador.getSituacao()%>" maxlength="100"></td>
                </tr>
                    <tr>
                    <td size="50" align="left">Observações:</td>
                    <td><input type="text" name="observacao" value="<%=computador.getObservacoes()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Atendente:</td>
                    <td><input type="text" name="atendente" value="<%=computador.getAtendente()%>" size="82" maxlength="100"></td>
                </tr>
            </table>
            <%}%>    
    </body>
</html>
