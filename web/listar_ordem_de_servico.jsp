<%-- 
    Document   : ListarOrdemDeServico
    Created on : 15/05/2017, 15:11:48
    Author     : Diego
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelos.Telefone"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Ordens de Serviço - Telefones</title>
    </head>
    <body>
        <header>
        <jsp:include page="header.jsp"/>
        </header>
        
        <h1>Lista de Ordens de Serviço</h1>

        <%  Telefone telefone = new Telefone();
            ArrayList<Telefone> arrayTel = new ArrayList<Telefone>();
            arrayTel=(ArrayList<Telefone>)request.getAttribute("arrayTel");      
        %>
        
        <br>
        Quantidade de ordens de serviço: <%=arrayTel.size()%>
        <br>
        
        <%for(int i=0;i<arrayTel.size();i++){
            
            telefone=arrayTel.get(i);
        %>
            <br>
            <br>
            <table width="50%" align="center" border="1">
                <tr>
                    <td width="180" align="left">Protocolo:</td>
                    <td><input type="text" name="protocolo" value="<%=String.valueOf(telefone.getProtocolo())%>" size="82" maxlength="50"></td>
                </tr>
                <tr>
                    <td width="180" align="left">Cliente:</td>
                    <td><input type="text" name="cliente" value="<%=telefone.getCliente()%>" size="82" maxlength="50"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Caixa:</td>
                    <td><input type="text" name="caixa" value="<%=telefone.getCaixa()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Data:</td>
                    <td><input type="text" name="data" value="<%=telefone.getDataEntrada()%>" size="30" maxlength="10"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Data da Compra:</td>
                    <td><input type="text" name="dataCompra" size="30" value="<%=telefone.getDataCompra()%>" maxlength="10"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Operadora:</td>
                    <td><input type="text" name="operadora" size="82" value="<%=telefone.getOperadora()%>" maxlength="100"></td>
                </tr> 
                <tr>
                    <td size="50" align="left">Garantia:</td>
                    <td><input type="text" name="garantia" size="82" value="<%=telefone.getGarantia()%>" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Marca:</td>
                    <td><input type="text" name="marca" value="<%=telefone.getMarca()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Modelo:</td>
                    <td><input type="text" name="modelo" value="<%=telefone.getModelo()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Serial:</td>
                    <td><input type="text" name="serial" value="<%=telefone.getSeriall()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Acessórios</td> 
                    <td><input type="text" name="acessorios" value="<%=telefone.getAcessorios()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Defeito:</td>
                    <td><input type="text" name="defeito" value="<%=telefone.getDefeito()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Estado do Aparelho:</td>
                    <td><input type="text" name="estadoAparelho" value="<%=telefone.getEstado()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Valor do Serviço:</td>
                    <td><input type="text" value="00" name="valorServico" value="<%=String.valueOf(telefone.getValor())%>" size="30" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Situação:</td>
                    <td><input type="text" name="situacao" size="82" value="<%=telefone.getSituacao()%>" maxlength="100"></td>
                </tr>
                    <tr>
                    <td size="50" align="left">Observações:</td>
                    <td><input type="text" name="observacao" value="<%=telefone.getObservacoes()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Atendente:</td>
                    <td><input type="text" name="atendente" value="<%=telefone.getAtendente()%>" size="82" maxlength="100"></td>
                </tr>
            </table>
            <%}%>
    </body>
</html>
