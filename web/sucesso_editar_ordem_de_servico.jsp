<%-- 
    Document   : sucesso_editar_ordem_de_servico
    Created on : 23/05/2017, 20:12:14
    Author     : Diego
--%>

<%@page import="modelos.Telefone"%>
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
        <%  Telefone telefone = new Telefone();
            telefone=(Telefone)request.getAttribute("telefone");      
        %>
            <form action="EditarOrdemDeServico1">
            <table width="50%" align="center" border="1">
                <tr>
                    <td width="180" align="left">Protocolo:</td>
                    <td><input type="text" name="protocolo" disable value="<%=String.valueOf(telefone.getProtocolo())%>" size="82" maxlength="50"></td>
                </tr>
                <tr>
                    <td width="180" align="left">Cliente*:</td>
                    <td><input type="text" name="cliente" value="<%=telefone.getCliente()%>" size="82" maxlength="50"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Caixa:</td>
                    <td><input type="text" name="caixa" value="<%=telefone.getCaixa()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Data*:</td>
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
                
                <%if(telefone.getGarantia().equalsIgnoreCase("sim"))
                {%>
                    <tr>
                        <td size="50" align="left">Garantia*:</td><td>
                        <input type="radio" name="garantia" value="Sim" checked>Sim
                        <input type="radio" name="garantia" value="Não">Não</td>
                    </tr>
                <%}%>
                <%if(telefone.getGarantia().equalsIgnoreCase("Nao") || telefone.getGarantia().equalsIgnoreCase("Não"))
                {%>
                    <tr>
                        <td size="50" align="left">Garantia*:</td><td>
                        <input type="radio" name="garantia" value="Sim">Sim
                        <input type="radio" name="garantia" value="Não" checked>Não</td>
                    </tr>
                <%}%>
                <tr>
                    <td size="50" align="left">Marca*:</td>
                    <td><input type="text" name="marca" value="<%=telefone.getMarca()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Modelo*:</td>
                    <td><input type="text" name="modelo" value="<%=telefone.getModelo()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Serial*:</td>
                    <td><input type="text" name="serial" value="<%=telefone.getSeriall()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Acessórios</td> 
                    <td><input type="text" name="acessorios" value="<%=telefone.getAcessorios()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Defeito*:</td>
                    <td><input type="text" name="defeito" value="<%=telefone.getDefeito()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Estado do Aparelho:</td>
                    <td><input type="text" name="estadoAparelho" value="<%=telefone.getEstado()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Valor do Serviço:</td>
                    <td><input type="text" name="valorServico" value="<%=String.valueOf(telefone.getValor())%>" size="30" maxlength="100"></td>
                </tr>
                
                <tr>
                <%if(telefone.getSituacao().equalsIgnoreCase("Encaminhado"))
                {%>
                    <td size="50" align="left">Situação*:</td>
                    <td size="50"><select name="situacao" multiple size="2">
                    <option value="Encaminhado" selected>Encaminhado</option>
                    <option value="Aguardando Autorizacao">Aguardando Autorização</option>
                    <option value="Aguardando Orcamento">Aguardando Orçamento</option>
                    <option value="Pronto">Pronto</option>
                    </select></td>
                <%}%>
                <%if(telefone.getSituacao().equalsIgnoreCase("Aguardando Autorização") || telefone.getSituacao().equalsIgnoreCase("Aguardando Autorizacao"))
                {%>
                    <td size="50" align="left">Situação*:</td>
                    <td size="50"><select name="situacao" multiple size="2">
                    <option value="Encaminhado">Encaminhado</option>
                    <option value="Aguardando Autorizacao" selected>Aguardando Autorização</option>
                    <option value="Aguardando Orcamento">Aguardando Orçamento</option>
                    <option value="Pronto">Pronto</option>
                    </select></td>
                <%}%>
                <%if(telefone.getSituacao().equalsIgnoreCase("Aguardando Orçamento") || telefone.getSituacao().equalsIgnoreCase("Aguardando Orcamento"))
                {%>
                    <td size="50" align="left">Situação*:</td>
                    <td size="50"><select name="situacao" multiple size="2">
                    <option value="Encaminhado">Encaminhado</option>
                    <option value="Aguardando Autorizacao">Aguardando Autorização</option>
                    <option value="Aguardando Orcamento" selected>Aguardando Orçamento</option>
                    <option value="Pronto">Pronto</option>
                    </select></td>
                <%}%>
                <%if(telefone.getSituacao().equalsIgnoreCase("Pronto"))
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
                    <td><input type="text" name="observacao" value="<%=telefone.getObservacoes()%>" size="82" maxlength="100"></td>
                </tr>
                <tr>
                    <td size="50" align="left">Atendente*:</td>
                    <td><input type="text" name="atendente" value="<%=telefone.getAtendente()%>" size="82" maxlength="100"></td>
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
