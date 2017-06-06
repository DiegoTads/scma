<%-- 
    Document   : sucesso_editar_ordem_de_servico_computador
    Created on : 23/05/2017, 20:12:34
    Author     : Diego
--%>

<%@page import="modelos.Computadores"%>
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
        <%  Computadores computador = new Computadores();
            computador=(Computadores)request.getAttribute("computador");      
        %>
            <form action="EditarOrdemDeServicoComputador1">
            <table width="50%" align="center" border="1">
                <tr>
                    <td width="180" align="left">Protocolo:</td>
                    <td><input type="text" name="protocolo" disable value="<%=String.valueOf(computador.getProtocolo())%>" size="82" maxlength="50"></td>
                </tr>
                <tr>
                    <td width="180" align="left">Cliente*:</td>
                    <td><input type="text" name="cliente" value="<%=computador.getCliente()%>" size="82" maxlength="50"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Data*:</td>
                    <td><input type="text" name="data" value="<%=computador.getDataEntrada()%>" size="30" maxlength="10"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Data da Compra:</td>
                    <td><input type="text" name="dataCompra" size="30" value="<%=computador.getDataCompra()%>" maxlength="10"></td>
                </tr>
                <%if(computador.getGarantia().equalsIgnoreCase("sim"))
                {%>
                    <tr>
                        <td size="50" align="left">Garantia*:</td><td>
                        <input type="radio" name="garantia" value="Sim" checked>Sim
                        <input type="radio" name="garantia" value="Não">Não</td>
                    </tr>
                <%}%>
                <%if(computador.getGarantia().equalsIgnoreCase("Nao") || computador.getGarantia().equalsIgnoreCase("Não"))
                {%>
                    <tr>
                        <td size="50" align="left">Garantia*:</td><td>
                        <input type="radio" name="garantia" value="Sim">Sim
                        <input type="radio" name="garantia" value="Não" checked>Não</td>
                    </tr>
                <%}%>
                <tr>
                    <td size="50" align="left">Marca*:</td>
                    <td><input type="text" name="marca" value="<%=computador.getMarca()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Modelo*:</td>
                    <td><input type="text" name="modelo" value="<%=computador.getModelo()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Serial*:</td>
                    <td><input type="text" name="serial" value="<%=computador.getSeriall()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Acessórios</td> 
                    <td><input type="text" name="acessorios" value="<%=computador.getAcessorios()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Defeito*:</td>
                    <td><input type="text" name="defeito" value="<%=computador.getDefeito()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Estado do Aparelho:</td>
                    <td><input type="text" name="estadoAparelho" value="<%=computador.getEstado()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Valor do Serviço:</td>
                    <td><input type="text" name="valorServico" value="<%=String.valueOf(computador.getValor())%>" size="30" maxlength="100"></td>
                </tr>
                
                <tr>
                <%if(computador.getSituacao().equalsIgnoreCase("Encaminhado"))
                {%>
                    <td size="50" align="left">Situação*:</td>
                    <td size="50"><select name="situacao" multiple size="2">
                    <option value="Encaminhado" selected>Encaminhado</option>
                    <option value="Aguardando Autorizacao">Aguardando Autorização</option>
                    <option value="Aguardando Orcamento">Aguardando Orçamento</option>
                    <option value="Pronto">Pronto</option>
                    </select></td>
                <%}%>
                <%if(computador.getSituacao().equalsIgnoreCase("Aguardando Autorização") || computador.getSituacao().equalsIgnoreCase("Aguardando Autorizacao"))
                {%>
                    <td size="50" align="left">Situação*:</td>
                    <td size="50"><select name="situacao" multiple size="2">
                    <option value="Encaminhado">Encaminhado</option>
                    <option value="Aguardando Autorizacao" selected>Aguardando Autorização</option>
                    <option value="Aguardando Orcamento">Aguardando Orçamento</option>
                    <option value="Pronto">Pronto</option>
                    </select></td>
                <%}%>
                <%if(computador.getSituacao().equalsIgnoreCase("Aguardando Orçamento") || computador.getSituacao().equalsIgnoreCase("Aguardando Orcamento"))
                {%>
                    <td size="50" align="left">Situação*:</td>
                    <td size="50"><select name="situacao" multiple size="2">
                    <option value="Encaminhado">Encaminhado</option>
                    <option value="Aguardando Autorizacao">Aguardando Autorização</option>
                    <option value="Aguardando Orcamento" selected>Aguardando Orçamento</option>
                    <option value="Pronto">Pronto</option>
                    </select></td>
                <%}%>
                <%if(computador.getSituacao().equalsIgnoreCase("Pronto"))
                {%>
                    <td size="50" align="left">Situação*:</td>
                    <td size="50"><select name="situacao" multiple size="2">
                    <option value="Encaminhado" selected>Encaminhado</option>
                    <option value="Aguardando Autorizacao">Aguardando Autorização</option>
                    <option value="Aguardando Orcamento">Aguardando Orçamento</option>
                    <option value="Pronto" selected>Pronto</option>
                    </select></td>
                <%}%>
                </tr>
                <tr>
                    <td size="50" align="left">Observações:</td>
                    <td><input type="text" name="observacao" value="<%=computador.getObservacoes()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Atendente*:</td>
                    <td><input type="text" name="atendente" value="<%=computador.getAtendente()%>" size="82" maxlength="100"></td>
                </tr>
            </table>   
                <br>
                <br>
                
                <center>
                    Deseja salvar as alterações? <br>
                    <input type="submit" name="excluir" value="Sim">
                    <input type="submit" name="excluir" value="Não">  
                </center>
                </form>
    </body>
</html>
